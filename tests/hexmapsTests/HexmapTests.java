package hexmapsTests;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import hexmaps.HexCoordinates;
import hexmaps.Hexmap;

public class HexmapTests
{
	private Hexmap aMap;
	
	@Before
	public void setUp() throws Exception
	{
		
	}
	
	@Test
	public void CoordinatesValid_returnsFalseWhenSumNotEqualZero()
	{
		//Arrange
		HexCoordinates invalidCoordinates = new HexCoordinates(0, 0, 1);
		
		//Act		
		
		//Assert
		assertFalse(Hexmap.CoordinatesValid(invalidCoordinates));
	}
	
	@Test
	public void CoordinatesValid_returnsTrueWhenSumEqualZero()
	{
		//Arrange
		HexCoordinates validCoordinates = new HexCoordinates(0, -1, 1);
		
		//Act
				
		//Assert
		assertTrue(Hexmap.CoordinatesValid(validCoordinates));
	}
	
}
