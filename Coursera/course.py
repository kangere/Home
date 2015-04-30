import random


number = 0
name = ""


def name_to_number(nameChosen):
        if(nameChosen == "rock" or nameChosen == "Rock"):
            number= 0
        elif(nameChosen == "Spock" or nameChosen == "spock"):
            number = 1
        elif(nameChosen == "paper" or nameChosen == "Paper"):
            number = 2
        elif(nameChosen == "lizard" or nameChosen == "Lizard"):
            number = 3
        elif(nameChosen == "Scissors" or nameChosen == "scissors") :
            number = 4
        return number


def number_to_name(numberChosen):
    if(numberChosen == 0):
        name = "rock"
    elif(numberChosen == 1):
        name = "spock"
    elif(numberChosen ==2):
        name = "paper"
    elif(numberChosen == 3):
        name = "lizard"
    elif(numberChosen == 4):
        name = "scissors"
    return name


def rpsls(player_choice):
    print("")

    player_number=name_to_number(player_choice)
    computer_number = random.randint(0,4)
    computer_choice = number_to_name(computer_number)
    print("Computer's choice is",computer_choice)
    print("Player's choice is ",player_choice)

    if(player_number < computer_number):
        if((computer_number - player_number) == 2 or (computer_number - player_number)== 1 ):
            print("Computer Wins")
        else:
            print("Player wins")
    elif(player_number > computer_number):
        if((player_number - computer_number)== 2 or(player_number - computer_number) == 1 ):
            print("Player wins")
        else:
            print("Computer Wins")
    else:
        print("draw")




rpsls("paper")
rpsls("rock")
rpsls("lizard")
rpsls("spock")
rpsls("scissors")