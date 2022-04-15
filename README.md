# cosc310individualproject
API implementation

#### Individual project
1. Pull repository though VS Code
2. Download models file from https://1drv.ms/u/s!AidBCfmtc0EDhtZiCroSVeDgESCegg?e=hZWT4m and put in Jars folder
3. Unzip dict.zip and replace folder in Dictionaries (For some reason the file gets corrupted when pulled through github)
4. Run Launcher.java

#### Google Static Maps API
Embeds images into the conversation. Used it to display images of where the company is located(can view the country, city, and specifc location).
It is triggered by certain keywords that may show up in the customer’s questions. It is implemented in Chatbot.java.  

#### Google Translate API
A new Transator method is created and it is called in Chatbot. The user can type in different languages and the user's input will be translated into English. The Chatbot will respond to the user's questions and also display the translation of the user's original text.  
