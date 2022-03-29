import numpy as np
import pandas as pd
from keras import layers
from keras.datasets import fashion_mnist
import matplotlib.pyplot as plt
from tensorflow import keras
import json

def main():
    # Prepare the data

    # Model / data parameters
    NUM_CLASSES = 10
    INPUT_SHAPE = (28, 28, 1)

    """
    the data, split between train and test sets
        x_train: images for training
        y_train: labels for training
        x_test: images for testing the model
        y_test: labels for testing the model
    """
    (x_train, y_train), (x_test, y_test) = fashion_mnist.load_data()

    # Scale images to the [0, 1] range
    # Cast to float values before to make sure result is float
    x_train = x_train.astype("float32") / 255
    x_test = x_test.astype("float32") / 255

    # convert class vectors (the labels) to binary class matrices
    y_train = keras.utils.to_categorical(y_train, NUM_CLASSES)
    y_labels = y_test  # use this to leave the labels untouched
    y_test = keras.utils.to_categorical(y_test, NUM_CLASSES)

    # Build the model
    model = keras.Sequential(
        [
            keras.Input(shape=INPUT_SHAPE),
            layers.Conv2D(32, kernel_size=(3, 3), activation="relu"),
            layers.MaxPooling2D(pool_size=(2, 2)),
            layers.Conv2D(64, kernel_size=(3, 3), activation="relu"),
            layers.MaxPooling2D(pool_size=(2, 2)),
            layers.Flatten(),
            layers.Dropout(0.5),
            layers.Dense(NUM_CLASSES, activation="softmax"),
        ]
    )

    model.summary()

    # Train the model
    batch_size = 128
    epochs = 30
    model.compile(loss="categorical_crossentropy", optimizer="adam", metrics=["accuracy"])
    history = model.fit(x_train, y_train, batch_size=batch_size, epochs=epochs, validation_split=0.1)

    # draw the learn function
    pd.DataFrame(history.history).plot(figsize=(8, 5))
    plt.show()

    # Evaluate the trained model
    score = model.evaluate(x_test, y_test, verbose=2)
    print("Test loss:", score[0])
    print("Test accuracy:", score[1])

    # Do some Predictions on the test dataset and compare the results
    pred = model.predict(x_test)
    print(f"Prediction for image 1: {pred[1]}")
    pred_1 = np.argmax(pred[1])
    print(f"Position with highest value of image 1: [{pred_1}]")

    for i in range(0, 100):
        pred_i = np.argmax(pred[i])  # get the position of the highest value within the list
        print(y_labels[i], pred_i)

    # How to load and save the model
    model.save('./models/task8a_model.mdl')
    model.save_weights("./models/task8a_model.h5")

    weights = model.get_weights()
    j = json.dumps(pd.Series(weights).to_json(orient='values'), indent=3)
    #print(j)

    model = keras.models.load_model('./models/task8a_model.mdl')
    model.load_weights("./models/task8a_model.h5")

    #model_json = model.to_json()
    #print (model_json)

if __name__ == "__main__":
    main()
