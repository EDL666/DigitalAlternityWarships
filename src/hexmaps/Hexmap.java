package hexmaps;

public class Hexmap
{

	public static boolean CoordinatesValid(HexCoordinates coordinates)
	{
		return coordinates.x + coordinates.y + coordinates.z == 0;
	}
	
}
