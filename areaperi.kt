import kotlin.math.PI

fun main (){

    var radius = 7.0

    //calculate the area of the circle

    var area = PI * radius * radius

    println("Area of the circle: %.2f" .format(area) )

    //calculate the perimeter of the circle

    var perimeter = PI * 2 * radius

    println("Perimeter (circumference) of the circle: %.2f" .format(perimeter))


}