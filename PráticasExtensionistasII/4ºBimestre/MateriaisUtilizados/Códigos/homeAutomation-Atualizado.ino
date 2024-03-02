#include <Stepper.h>
#include <HCSR04.h>

#define photoresistor A0
#define buzzer 2
#define rele 3
#define trigger 4
#define echo 5
#define button 7
#define smInput1 8
#define smInput2 9
#define smInput3 10
#define smInput4 11

const int steps = 64;
Stepper stepMotor (steps, smInput1, smInput3, smInput2, smInput4);
UltraSonicDistanceSensor distanceSensor (trigger, echo);
int luminosity = 0;
double distance;

void setup () {
  pinMode (photoresistor, INPUT);
  pinMode (buzzer, OUTPUT);
  pinMode (rele, OUTPUT);
  pinMode (button, INPUT);
  stepMotor.setSpeed (350);

  Serial.begin (9600);
}

void loop () {
  // Step motor configuration
  static int previousButtonState = 0;
  int pushButton = digitalRead (button);
  if (pushButton == 1 && previousButtonState == 0) {
    rotateClockwise ();
  }
  else if (pushButton == 0 && previousButtonState == 1) {
    rotateCounterClockwise ();
  }
  previousButtonState = pushButton;

  // Verify the distance and turn the buzzer on/off
  //distance = distanceSensor.measureDistanceCm ();
  distance=readUltrasonicSensor();
  luminosity = analogRead (photoresistor);
  Serial.print ("Distância: ");
  Serial.print(distance);
  Serial.println(" cm");
  Serial.println ("---------------------");
  delay (0);
  if (distance < 17) {
    digitalWrite (buzzer, HIGH);
    tone(buzzer,261);    
    // Espera um tempo para Desativar
    delay(200);
    //Desativa o buzzer
    noTone(buzzer); 
    // Aciona o buzzer na frequencia relativa ao Ré em Hz   
    tone(buzzer,293);             
    delay(200);    
    noTone(buzzer);
  }
  else {
    digitalWrite (buzzer, LOW);
  }

  // Verify the luminosity and turn the light on/off
  Serial.print("Luminosidade: ");
  Serial.print(luminosity);
  Serial.println(" lux");
  Serial.println("---------------------");
  if (luminosity < 300) {
    digitalWrite (rele, LOW);
  }
  else {
    digitalWrite (rele, HIGH);
  }
  delay (500);
}

long readUltrasonicSensor(){ 
  // Send 10µs pulse 
  digitalWrite(trigger, HIGH); 
  delayMicroseconds(10); 
  digitalWrite(trigger, LOW); 
  // Read pulse duration 
  long duration = pulseIn(echo, HIGH); 
  Serial.println(duration); //Convert and return value 
  return duration/ 58; 
}

void rotateClockwise () {
  for (int i = 0; i < 8; i++) {
    stepMotor.step (steps);
  }
}

void rotateCounterClockwise () {
  for (int i = 0; i < 8; i++) {
    stepMotor.step (-steps);
  }
}