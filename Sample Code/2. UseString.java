package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp()
public class UseString extends OpMode {
	@Override
	public void init() {
		String myName = "Lincoln Cogdill"
		String myGrade = "9"

		telemetry.addData("Hello", myName);
		telemetry.addData("Your Grade Level", myGrade)
	}

	@Override
	public void loop() {
				
	}
}