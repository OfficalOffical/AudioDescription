# Audio Description app for blind people.

Audio description app using mobile phone's camera to sounding environment with Tensorflow-Lite and Mobilenet-SSD. The output is the name of the object and the position of it on the screen as far or close and right, left or middle as sound on mobile. This project is used [this](https://github.com/tensorflow/examples/tree/master/lite/examples/object_detection/android) code as a source.


### Changing tresholds for more accurate usage

Inside the lib_task_api/src/main/java/.tflite/APIModel. 
- If you want project to talk faster you can change counter % 20 to lower like counter % 10
- Project talks if the accuracy is bigger than %70. You can change it by changing float number inside the isFitForVoiceOver() function
- Project takes area of the square of the object so if you want to arrange range option just change area value inside the isClose() Function


## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

### Output
![image](https://user-images.githubusercontent.com/18538179/147435211-a5b65913-379d-4adf-b109-df0ab46a6ea3.png)
![image](https://user-images.githubusercontent.com/18538179/147435263-81d25db3-a439-4861-b245-af173c2e1aca.png)



