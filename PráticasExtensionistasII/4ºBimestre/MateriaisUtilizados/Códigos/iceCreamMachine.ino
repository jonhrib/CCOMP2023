#define chocolatteLevelSensor 2
#define strawberryLevelSensor 3
#define chocolattePushButton 4
#define strawberryPushButton 5
#define chocolatteLightIndicator 6
#define strawberryLightIndicator 7
#define chocolattePump 8
#define strawberryPump 10

bool chocolatteContainer;
bool chocolatteButtonReleaser;
bool strawberryContainer;
bool strawberryButtonReleaser;

void setup() {
  pinMode(chocolatteLevelSensor, INPUT_PULLUP);
  pinMode(strawberryLevelSensor, INPUT_PULLUP);
  pinMode(chocolattePushButton, INPUT_PULLUP);
  pinMode(strawberryPushButton, INPUT_PULLUP);
  pinMode(chocolatteLightIndicator, OUTPUT);
  pinMode(strawberryLightIndicator, OUTPUT);
  pinMode(chocolattePump, OUTPUT);
  pinMode(strawberryPump, OUTPUT);
}

void loop() {
  chocolatteContainer = digitalRead(chocolatteLevelSensor);
  chocolatteButtonReleaser = digitalRead(chocolattePushButton);
  strawberryContainer = digitalRead(strawberryLevelSensor);
  strawberryButtonReleaser = digitalRead(strawberryPushButton);


  if (chocolatteContainer == HIGH) {
    if (chocolatteButtonReleaser == HIGH) {
      digitalWrite(chocolattePump, LOW);
    }
    else {
      digitalWrite(chocolattePump, HIGH);
    }
    digitalWrite(chocolatteLightIndicator, LOW);
  }
  else {
    digitalWrite(chocolatteLightIndicator, HIGH);
    digitalWrite(chocolattePump, HIGH);
  }


  if (strawberryContainer == HIGH) {
    if (strawberryButtonReleaser == HIGH) {
      digitalWrite(strawberryPump, LOW);
    }
    else {
      digitalWrite(strawberryPump, HIGH);
    }
    digitalWrite(strawberryLightIndicator, LOW);
  }
  else {
    digitalWrite(strawberryLightIndicator, HIGH);
    digitalWrite(strawberryPump, HIGH);
  }
}
