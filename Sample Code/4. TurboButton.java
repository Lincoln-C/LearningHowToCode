package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp()
public class TurboButton extends OpMode {
	@Override
	public void init() {
		
	}

	@Override
	public void loop() {
		double fwdSpeed = gamepad1.left_stick.y;

		//if "a" button NOT pressed (!), speed *.5
		if (!gamepad1.a) {
			fwdSpeed *= 0.5;
		}
		telemetry.addData("Forward Speed", fwdSpeed);
	}
}