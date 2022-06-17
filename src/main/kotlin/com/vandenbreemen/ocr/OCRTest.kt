package com.vandenbreemen.ocr

import net.sourceforge.tess4j.Tesseract
import java.io.File

class OCRTest() {



}

fun main() {

    val tess = Tesseract()
    tess.setDatapath("/usr/share/tesseract-ocr/5/tessdata")
    tess.setLanguage("eng")

    tess. setVariable("tessedit_create_hocr", "1")
    println(tess.doOCR(File("./testdata/test.png")))

}