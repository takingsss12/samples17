package com.sqli.test.romanrunner.entities;

public final class Charioteer extends Player
{
	public Charioteer(String name)
	{
		super(name);
	}

	@Override
	void whenArrived()
	{
		score += 100;
	}

	@Override
	void whenEarnedCoin()
	{
		score += 10;
	}

	@Override
	void whenHitObstacle()
	{
		isDead = true;
		score -= 5;
	}

	@Override
	public char draw()
	{
		return !isDead ? super.draw() : 'D';
	}

	@Override
	boolean isGameEnded()
	{
		return isDead;
	}
}
