
/**
 * ThreeDShape.java
 * @course BIL343 Object Orinted Programming w/Java
 * @lecture Definition of ThreeDShape abstract class
 * @author Mustafa Sert (msert@baskent.edu.tr)
 * 2022-11-3
 */
public abstract class ThreeDShape implements Shape{
	// implicitly inherited members are
	// PI, getName(), area(), circum(), volume()
	
	public String getName() {
		return "3D Shape";
	}
	
	
	
}
