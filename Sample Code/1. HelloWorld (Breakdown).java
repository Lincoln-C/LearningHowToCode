//Imports commands, necessary for code to function.
package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;


	/* TeleOp info -
	 * This is CRUCIAL. This is what shows up on the driver station as an OpMode
	 * (Examples include TeleOp [driver controlled], and Autonomous [FULL code control])
	 */
@TeleOp()


	/* Definitions for below -
	 * public - means others can see it. Required for OpModes.
	 * class - means we are defining a class.
	 * HelloWorld - this is the name of the class. It MUST be the same as the filename.
	 * extends OpMode - This means the class is a child of OpMode.
	 * 	A class is defined from the opening curly brace "{" to the closing brace "}".
	 */
public class HelloWorld extends OpMode {


	/* This is called when the driver presses INIT on the driver station
	 * Meanings:
	 * @Override tells the compiler that we are meaning to replace functionality in our parent class.
	 * public means this method is callable from outside the class.
	 * void means it doesn't return anything.
	 * init is the name of a method.
	 * 	Inside of the parenthesis are any parameters passed in or none.
	 * 	The method is defined from the opening curly brace "{" to the closing brace "}".
	 * telemetry.addData(caption, value); This is very cool, sends data to the driver station, used for debugging.
	 */
	@Override
	public void init() {
		telemetry.addData("Hello","World");
	}


	/* Loops info -
	 * Loops are often used in TeleOp (Driver controlled period), when the robot needs to look
	 * for constant input of buttons.
	 * This is rarely utilized in the Autonomous mode.
	 */
	@Override
	public void loop() {

	// intentionally left blank
	}

}