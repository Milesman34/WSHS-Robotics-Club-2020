//If direction == true, move forwards. If direction == false, move backwards.
//public static void motor1(double duration, int direction = true)

//Moves the robot forwards
public static void moveForwards(double duration) {
	motor1(duration);
	motor2(duration);
}

//Moves the robot backwards
public static void moveBackwards(double duration) {
	motor1(duration, false);
	motor2(duration, false);
}

//Executes a sharp right turn
public static void turnRight(double duration) {
	motor1(duration);
	motor2(duration, false);
}

//Executes a sharp left turn
public static void turnLeft(double duration) {
	motor1(duration, false);
	motor2(duration);
}

//Executes a gradual right turn
public static void gradualTurnRight(double duration) {
	motor1(duration);
}

//Executes a gradual left turn
public static void gradualTurnLeft(double duration) {
	motor2(duration);
}