package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here



                int secim = 0, index = 0;
                String[][] rehber;
                String kisiAdi = "", kisiNumarasi = "", arananKisi = "", duzenlenecekKisiBilgisi = "";
                boolean arananKisiBulunduMu = false;
                rehber = new String[20][3];
                Scanner klavye = new Scanner(System.in);
                Scanner klavye2 = new Scanner(System.in);

                do {
                    System.out.println("Telefon Rehberi");
                    System.out.println("-----------------------------");
                    System.out.println("1- Kişi Ekle");
                    System.out.println("2- Listele");
                    System.out.println("3- Arama");
                    System.out.println("4- Silme");
                    System.out.println("5- Düzenleme");
                    System.out.println("6- Çıkış");

                    System.out.println("Lütfen bir seçim yapınız");
                    secim = klavye.nextInt();

                    switch (secim) {
                        case 1:
                            if (index < 20) {
                                System.out.println("Kişinin adını giriniz");
                                kisiAdi = klavye2.nextLine();
                                System.out.println("Kişinin telefon numarasını giriniz");
                                kisiNumarasi = klavye2.nextLine();

                                rehber[index][0] = index + 1 + "";
                                rehber[index][1] = kisiAdi;
                                rehber[index][2] = kisiNumarasi;
                                index++;
                            } else {
                                System.out.println("Kişi hafızası dolmuştur. Ekleme yapamazsınız...");
                            }
                            break;

                        case 2:
                            if (index > 0) {
                                System.out.println("Kişi Listesi");
                                System.out.println("----------------------");

                                for (int i = 0; i < index; i++) {
                                    System.out.println(rehber[i][0] + " - " + rehber[i][1] + " " + rehber[i][2]);
                                }
                            } else {
                                System.out.println("Henüz kişi eklenmedi.");
                            }
                            break;

                        case 3:
                            arananKisiBulunduMu = false;

                            if (index != 0) {
                                System.out.println("Aradığınız kişiyi giriniz.");
                                arananKisi = klavye2.nextLine();

                                for (int i = 0; i < index; i++) {
                                    if (arananKisi.equals(rehber[i][1])) {
                                        System.out.println("Aranan kişi bilgileri : ");
                                        System.out.println(rehber[i][0] + " - " + rehber[i][1] + " " + rehber[i][2]);
                                        arananKisiBulunduMu = true;
                                        break;
                                    }
                                }
                                if (!arananKisiBulunduMu) {
                                    System.out.println("Aranan kişi bulunamamıştır.");
                                }
                            } else {
                                System.out.println("Önce Kişi Ekleyiniz");
                            }
                            break;

                        case 4:
                            arananKisiBulunduMu = false;

                            if (index != 0) {
                                System.out.println("Silinecek kişinin adını giriniz.");
                                arananKisi = klavye2.nextLine();

                                for (int i = 0; i < index; i++) {
                                    if (arananKisi.equals(rehber[i][1])) {

                                        for (int j = i; j < (index - 1); j++) {
                                            rehber[j][0] = (Integer.parseInt(rehber[j + 1][0]) - 1) + "";
                                            rehber[j][1] = rehber[j + 1][1];
                                            rehber[j][2] = rehber[j + 1][2];
                                        }

                                        index--;
                                        arananKisiBulunduMu = true;
                                        break;
                                    }
                                }
                                if (!arananKisiBulunduMu) {
                                    System.out.println("Silinecek kişi bulunamadı.");
                                }
                            } else {
                                System.out.println("Silmek için önce eklemelisiniz.");
                            }
                            break;

                        case 5:
                            arananKisiBulunduMu = false;
                            if (index != 0) {
                                System.out.println("Düzenlenecek kişinin adını giriniz.");
                                arananKisi = klavye2.nextLine();

                                for (int i = 0; i < index; i++) {
                                    if (arananKisi.equals(rehber[i][1])) {
                                        System.out.println("Kişinin adını mı numarasını mı düzenleyeceksiniz?(adı,numarası)");
                                        duzenlenecekKisiBilgisi = klavye2.nextLine();
                                        if (duzenlenecekKisiBilgisi.equals("adı")) {
                                            System.out.println("Lütfen yeni adı giriniz");
                                            rehber[i][1] = klavye2.nextLine();
                                        } else if (duzenlenecekKisiBilgisi.equals("numarası")) {
                                            System.out.println("Lütfen yeni numarayı giriniz");
                                            rehber[i][2] = klavye2.nextLine();
                                        } else {
                                            System.out.println("Yanlış işlem girdiniz. Başa dönüyorsunuz.");
                                        }
                                        arananKisiBulunduMu = true;
                                        break;
                                    }
                                }
                                if (!arananKisiBulunduMu) {
                                    System.out.println("Düzenlenecek kişi bulunamadı.");
                                }
                            }
                        case 6:
                            break;
                        default:
                            System.out.println("Yanlış işlem yaptınız.");
                    }

                } while (secim != 6);
            }
        }
