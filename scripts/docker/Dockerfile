FROM ubuntu:20.04

RUN apt-get update && apt-get -y  install openjdk-11-jdk

RUN apt-get install software-properties-common -y && apt-get update

RUN add-apt-repository ppa:alex-p/tesseract-ocr-devel -y && apt update
RUN apt-get -y install tesseract-ocr libtesseract-dev wget

RUN wget https://github.com/tesseract-ocr/tessdata/raw/main/eng.traineddata -O /usr/share/tesseract-ocr/5/tessdata/eng.traineddata

COPY ./testdata/* ./



