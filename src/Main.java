public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1-1");
        int salary = 65535;
        int i = 0;
        int total = 0;
        while(total <=2_459_000){
            total += salary;
            i += 1;
            System.out.println("Месяц " + i +", сумма накоплений равна " + total + " рублей ");
        }
        System.out.println("Task 1-2");
        int x = 0;
        while (x < 10){
            x += 1;
            System.out.print(x + " ");
        }
        System.out.println();
        int y = 11;
        while(y > 1){
            y -= 1;
            System.out.print(y + " ");
        }
        System.out.println("Task 1-3");
        int population = 12_000_000;
        double birth = (double)17 / 1000;
        double death = (double) 8/1000;
        int years = 0;
        while(years<10){
            population = (int)(population + (birth * population) - (death * population));
            years +=1;
            System.out.println("Год " + years + ", численность населения составляет " + population);
        }
        System.out.println("Task 2-1");
        int deposit = 15000;
        int monthGrowth = deposit + (deposit/ 100 * 7);
        int total1 = 0;
        int month = 0;
        while(total1 < 12_000_000){
            total1 += monthGrowth;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений " + total1);
        }
        System.out.println("Task 2-2");
        int deposit1 = 15000;
        int monthGrowth1 = deposit1 + (deposit1/ 100 * 7);
        int total2 = 0;
        int month1 = 0;
        while(total2 < 12_000_000){
            total2 += monthGrowth1;
            month1++;
            if (month1 % 6 == 0){
                System.out.println("Месяц " + month1 + ", сумма накоплений " + total2);}
        }
        System.out.println("Task 2-3");
        int monthCollection = 0;
        int startDeposit = 15000;
        int percent = startDeposit + (startDeposit / 100 * 7);
        int sum = 0;
        while(monthCollection < 18){
            sum += percent;
            monthCollection ++;
            System.out.println("Полугодие " + monthCollection + ", сумма накоплений " + sum);

        }
        System.out.println("Task 2-4");
        int day = 0;
        while (day < 31){
            day ++;
            if(day % 7 == 1){
            System.out.println("Сегодня пятница, " + day + "число. Необходимо подготовить отчет");
            }
        }
        System.out.println("Task 3-1");
        int starYear = 2022;
        int lastPeriod = starYear - 200;
        int forwardPeriod = starYear + 100;
        while(starYear > lastPeriod && starYear < forwardPeriod){
            starYear++;
            if (starYear % 79 == 0){
                System.out.println(starYear);
            }
        }
        System.out.println("Task 3-2");
        int n = 2;
        int j = 1;
        while(j < 10){
            j ++;
            System.out.println(n + "*" + j + "=" + n*j);
        }
        }



    }
