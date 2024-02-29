//final class Captain
package afp;

class Captain
{
private static Captain captain;
//We make the constructor private to prevent the use of "new"
static int numberOfInstance=0;
private Captain()
{
numberOfInstance++;
System.out.println("Number of instances at this moment="+
numberOfInstance);
}
public static synchronized Captain getCaptain()
{