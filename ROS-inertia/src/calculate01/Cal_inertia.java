package calculate01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Box
{
	private double height;
	private double width;
	private double depth;
	private double weight;
	private double ixx;
	private double iyy;
	private double izz;

	public void setBox(double h,double wi,double d,double we)
	{
		height = h;
		width = wi;
		depth = d;
		weight = we;
	}

	public void calc_Box_inertia()
	{
		ixx = 1.0 / 12.0 * weight * (width * width + height * height);
		iyy = 1.0 / 12.0 * weight * (depth * depth + height * height);
		izz = 1.0 / 12.0 * weight * (depth * depth + width * width);
	}

	public void show()
	{
		System.out.println("ixx = " + ixx);
		System.out.println("iyy = " + iyy);
		System.out.println("izz = " + izz);
	}
}

public class Cal_inertia {

	public static void main(String[] args)  throws IOException
	{
		//キーボードから文字を読み込む
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

		Box box1 = new Box();

		while(true) {
			System.out.println("箱の高さを入力してください");
			String strh = br.readLine();

			System.out.println("箱の幅を入力してください");
			String strwid = br.readLine();

			System.out.println("箱の奥行きを入力してください");
			String strd = br.readLine();

			System.out.println("箱の質量を入力してください");
			String strwei = br.readLine();

			double height = Double.parseDouble(strh);
			double width = Double.parseDouble(strwid);
			double depth = Double.parseDouble(strd);
			double weight = Double.parseDouble(strwei);

			box1.setBox(height, width, depth, weight);
			box1.calc_Box_inertia();
			box1.show();
		}

	}

}
