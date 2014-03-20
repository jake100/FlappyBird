
public class Ring extends GameObject{
	public boolean collected = false;
	public Ring()
	{
        width = 32;
        height = 32;
        int maxY = App.HEIGHT - 80 - height;
		x = App.WIDTH;
        y = rnd.nextInt(maxY);
        xvel = 0;
        path = "res/ring.png";
	}
	public void update()
	{
		xvel += .125;
		x -= (int)xvel;
		if(x + width < 0)
		{
			alive = false;
		}
	}

}
