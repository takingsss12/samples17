package com.sqli.test.romanrunner.entities;

import com.sqli.test.romanrunner.entities.utils.ComparableIntPair;

public final class EmptySlot extends Slot
{
	public EmptySlot(ComparableIntPair position)
	{
		super(position);
		// TODO Auto-generated constructor stub
	}

	@Override
	public char draw()
	{
		return ' ';
	}
}
