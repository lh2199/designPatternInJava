package com.ctgu.proxy;

/**
 * @ClassName: People
 * @Description:
 * @author lh2
 * @date 2020年6月12日 下午5:12:11
 */
public class People implements BuyCar
{
	private int cash;
	private String vip;
	private String username;

	@Override
	public void buyMycar()
	{
		System.out.print(username + "是vip 客户，可以直接购买新车！");
	}

	public int getCash()
	{
		return cash;
	}

	public void setCash(int cash)
	{
		this.cash = cash;
	}

	public String getUsername()
	{
		return username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public String getVip()
	{
		return vip;
	}

	public void setVip(String vip)
	{
		this.vip = vip;
	}
}
