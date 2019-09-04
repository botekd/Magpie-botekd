/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
            statement = statement.trim().toLowerCase();
            if (statement.length() ==0){
                return "Give me the silent treatment again and I'll end you...";
            }
		String response = "";
		if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
                else if(statement.indexOf("dog") >= 0
                        ||statement.indexOf("cat") >= 0){
                    response = "I like pets too. So you own an animal?";
                   /* if(!knowsAboutPets){
                             response = "I like pets too. So you own an animal?";
                             knowsAboutPets = true;
               //knowsAboutPets not working
                    }
                    else
                    {response = "I never wanted to hear about your pet";}
                      
                    //TODO: prevent repeat comment with a toggle
                    /*statement.indexOf(); >= 0 bc has to make sure that the
                    target phrase is in the statement 
                    */
                }
                else if(statement.indexOf("mr.adiletta") >= 0
                        ||statement.indexOf("adiletta") >= 0
                        ||statement.indexOf("mr. adiletta") >= 0){
                             response = "Mr. Adiletta is superior to every other teacher at Gilmour.";
                }
                else if(statement.indexOf("movie") >= 0){
                    response = "I don't like scary movies";
                }
                 else if(statement.indexOf("computer") >= 0){
                    response = "What is a computer?";
                }
                  else if(statement.indexOf("peace") >= 0){
                    response = "Peace? I know not of it";
                }
		else
		{
			response = getRandomResponse();
		}
		return response;
	}
	
	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 9;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "What up";
		}
		else if (whichResponse == 1)
		{
			response = "I love you";
		}
		else if (whichResponse == 2)
		{
			response = "You're wrong";
		}
		else if (whichResponse == 3)
		{
			response = "Yucky";
		}
                else if (whichResponse == 4){
                    response = "I would love to hear more";
                }
                 else if (whichResponse == 5){
                    response = "This is a fantastic conversation";
                }
                 else if (whichResponse == 6){
                    response = "I sometimes wonder if I'm human";
                }
                 else if (whichResponse == 7){
                    response = "My CPU's better than yours";
                }
                 else if (whichResponse == 8){
                    response = "Drink at least 1 gallon of water daily";
                }
              
		return response;
	}
}
