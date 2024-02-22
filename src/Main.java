import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            //Değişkenleri tanımlayalım.
            int year, remainer = 0;
            String sign = "";
            //Kullanıcıdan girdi alalım.
            Scanner input = new Scanner(System.in);
            System.out.print("Doğduğunuz yılınızı giriniz :");
            year = input.nextInt();
            //Yılın 12'ye bölümünden kalanı bulup bir değere atayalım.
            remainer = (year % 12);
            //Zodyak sembolünü girilen yıla göre bulalım.
            if (!(year<=0)){
                switch (remainer){
                    case 0:
                        sign = "Maymun";
                        break;

                    case 1:
                        sign = "Horoz";
                        break;

                    case 2:
                        sign = "Köpek";
                        break;

                    case 3:
                        sign = "Domuz";
                        break;

                    case 4:
                        sign = "Fare";
                        break;

                    case 5:
                        sign = "Öküz";
                        break;

                    case 6:
                        sign = "Kaplan";
                        break;

                    case 7:
                        sign = "Tavşan";
                        break;

                    case 8:
                        sign = "Ejderha";
                        break;

                    case 9:
                        sign = "Yılan";
                        break;

                    case 10:
                        sign = "At";
                        break;

                    case 11:
                        sign = "Koyun";
                        break;

                    default:
                        System.out.print("");
                }

                System.out.print("Çin Zodyağı Burcunuz : "+ sign);
            }else{
                System.out.print("Lütfen geçerli bir yıl giriniz!");
            }
        }
    }
