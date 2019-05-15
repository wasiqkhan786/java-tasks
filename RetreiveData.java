public class RetreiveData {
 
    private BufferedImage image=null;
	private int pixels[][];
	private char Data[];
	private int Width,Height;
	private String myString="";
 
	public RetreiveData()
	{
		try
		{
			image= ImageIO.read(new File("Copy.png"));
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
 
 
 
		pixels= new int[image.getWidth()][image.getHeight()];
 
		Width=image.getWidth();
		Height=image.getHeight();
 
		System.out.println(Width);
		System.out.println(Height);
 
		for(int i=0;i<Width;i++)
		{
			for(int j=0;j<Height;j++)
			{
				pixels[i][j]=image.getRGB(i, j);
			}
		}
 
		FileWriter fw=null;
		File file=null;
		BufferedWriter bw=null;
 
		try
		{
			file = new File("Message.txt");
			fw = new FileWriter(file);
 
			bw= new BufferedWriter(fw);
 
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
 
	//	Data=file.toString().toCharArray();
 
		ReadLSB();
 
		try 
		{
			bw.write(myString);
			bw.close();
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
 
 
	}
 
	private void ReadLSB()
	{		
		int temp,tempText=0,x=0,p=0;
 
		for(int i=0;i<Width;i++)
		{
			for(int j=0;j<Height;j++)
			{
				temp=pixels[i][j];
 
				int change=0;	
 
				for(int k=0;k<4;k++)
				{
					if(k==0)
					{
						change=1;
					}
					else
						if(k==1)
						{
							change=256;
						}
						else
							if(k==2)
							{
								change=65536;
							}
							else
								if(k==3)
								{
									change = 16777216;
								}
 
 
					tempText=tempText | (pixels[i][j] & change);
 
					p++;
					if(p==8)
					{
						myString += (char) tempText;// convert int to String and storing in String object
						p=0;
						x++;
						System.out.println("Inside");
						System.out.print(myString);
					}
				}
 
 
 
			}
		}
	}
}