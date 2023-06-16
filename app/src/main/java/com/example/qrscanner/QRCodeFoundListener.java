package com.example.qrscanner;

public interface QRCodeFoundListener {
    void onQRCodeFound(String qrCode);

    void qrCodeNotFound();
}
