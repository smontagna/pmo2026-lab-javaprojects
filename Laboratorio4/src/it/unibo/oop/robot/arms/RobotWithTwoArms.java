package it.unibo.oop.robot.arms;
import it.unibo.oop.robot.base.BaseRobot;

public class RobotWithTwoArms extends BaseRobot implements RobotWithArms
{ 
	private final BasicArm arm1;
    private final BasicArm arm2;
    
    public RobotWithTwoArms(String robotName) 
    {
        super(robotName);
        this.arm1 = new BasicArm("left");
        this.arm2 = new BasicArm("right");
    }

	@Override
	public boolean pickUp() 
	{
		boolean result = false;
		
		/* Usiamo if-else if per raccogliere un solo oggetto alla volta per chiamata */
		if (!arm1.isGrabbing() && this.isBatteryEnough(arm1.getConsuptionForPickUp())) 
		{
            arm1.pickUp();
            this.consumeBattery(arm1.getConsuptionForPickUp());
            System.out.println("pick up done con braccio " + arm1 + "!!");
            result = true;
        }
		else if (!arm2.isGrabbing() && this.isBatteryEnough(arm2.getConsuptionForPickUp())) 
		{
            arm2.pickUp();
            this.consumeBattery(arm2.getConsuptionForPickUp());
            System.out.println("pick up done con braccio " + arm2 + "!!");
            result = true;
        }
		
		/* Se siamo arrivati qui, o entrambi i bracci sono occupati o la batteria non basta */
		else if (arm1.isGrabbing() && arm2.isGrabbing()) 
		{
			System.out.println("Non è possibile raccogliere. BRACCI OCCUPATI!!");
		} 
		
		else 
		{
			System.out.println("Non è possibile prendere. BATTERIA SCARICA!!");
		}
		
		return result;
	}

	@Override
	public boolean dropDown() 
	{
		boolean result = false;
		
		/* Rilasciamo un oggetto alla volta partendo dal primo braccio occupato */
		if (arm1.isGrabbing() && this.isBatteryEnough(arm1.getConsuptionForDropDown())) 
		{
            arm1.dropDown();
            this.consumeBattery(arm1.getConsuptionForDropDown());
            System.out.println("Il braccio sinistro ha rilasciato l'oggetto!!");
            result = true;
        }
		
		else if (arm2.isGrabbing() && this.isBatteryEnough(arm2.getConsuptionForDropDown())) 
		{
            arm2.dropDown();
            this.consumeBattery(arm2.getConsuptionForDropDown());
            System.out.println("Il braccio destro ha rilasciato l'oggetto!!");
            result = true;
        }
		
		return result;
	}

	@Override
    public int getCarriedItemsCount() 
	{
        int count = 0;
        if (arm1.isGrabbing())
            count++;
        if (arm2.isGrabbing())
            count++;
        return count;
    }

}