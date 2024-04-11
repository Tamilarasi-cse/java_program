import java.util.Scanner;
import java.util.*;
interface Shape
{
 void printArea();
}
class Rectangle implements Shape
{
int length,int breath;
void printArea()
{
int area = length*breath;
}
}
class Triangle implements Shape
{
int length,int breath;
void printArea()
{
double area = 0.5*length*breath;
}
}
class Circle implements Shape
{
int radius;
void printArea()
{
double area = 3.14*radius*radius;
}
}
class Shapes {
public static void main (String args[])
{
