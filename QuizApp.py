#dictionary that stores questions and answers
#have a variable that tracks the score of the player
#loop through the dictionary using the key values pair
#display each question to the user and allow them to answer
#tell them if they are right or wrong
#show the final result when quiz is completed

quiz = {
    "question1": {
        "question": "Who is the father of the computer?",
        "answer": "Charles Babbage"
    },
    "question2": {
        "question": "Which of the following is the correct abbreviation of COMPUTER?",
        "answer": "Commonly Operated Machine Particularly Used for Technical and Educational Research"
    },
    "question3": {
        "question": "What is the full form of CPU?",
        "answer": "Central Processing Unit"
    },
    "question4": {
        "question": "Which of the following is the brain of the computer?",
        "answer": "Central Processing Unit"
    },
    "question5": {
        "question": "Which of the following is the smallest unit of data in a computer?",
        "answer": "Bit"
    },
"question6": {
        "question": "What does RAM stand for?",
        "answer": "Random Access Memory"
    },
    "question7": {
        "question": "Which programming language is known as the 'mother of all languages'?",
        "answer": "C"
    },
    "question8": {
        "question": "What is the process of finding errors and bugs in software?",
        "answer": "Debugging"
    },
    "question9": {
        "question": "What is the main purpose of an operating system?",
        "answer": "Manage computer hardware and software resources"
    },
    "question10": {
        "question": "What does HTML stand for?",
        "answer": "Hypertext Markup Language"
    },
    "question11": {
        "question": "Which component of a computer is responsible for executing instructions?",
        "answer": "CPU"
    },
    "question12": {
        "question": "What is the term for a network security system that monitors and controls incoming and outgoing network traffic?",
        "answer": "Firewall"
    },
    "question13": {
        "question": "What is the binary representation of the decimal number 25?",
        "answer": "11001"
    },
    "question14": {
        "question": "Which type of software is designed to harm or exploit computers?",
        "answer": "Malware"
    },
    "question15": {
        "question": "What does SSD stand for in the context of computer storage?",
        "answer": "Solid State Drive"
    },
}

score = 0
for key, value in quiz.items():
    print(value["question"])
    answer = input("Answer: ")

    if answer.lower() == value["answer"].lower():
        print("Correct!")
        score = score + 1
    else:
        print("Wrong!")
        print("The answer is:", value["answer"])

    print("Your score is:", score)

print("Quiz completed!")
print("Your final score is:", score)
