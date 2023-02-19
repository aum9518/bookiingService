import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Car car1 = new Car("Hyundai", "SantaFE", 2020, 38000, "Black");
            Car car2 = new Car("Ferrari", "LAFERARI", 2022, 380000, "Black");
            Car car3 = new Car("KIA", "Sorrento", 2020, 30000, "white");
            Car car4 = new Car("Mercedes Benz", "GLA", 2022, 45000, "Black");
            Car car5 = new Car("BMW", "X7", 2020, 60000, "Black");
            Car car6 = new Car("Toyota", "Camry", 2021, 40000, "Black");
            Car car7 = new Car("Honda", "CR-V", 2018, 25000, "Blue");
            Car car8 = new Car("Audi", "A6", 2019, 20000, "White");

            Car[] cars = new Car[]{car1, car2, car3, car4, car5, car6, car7, car8};

            Driver driver1 = new Driver("Askat", "Jumaev", 25, "Driver");
            Driver driver2 = new Driver("Bek", "Kutuev", 35, "Driver");
            Driver driver3 = new Driver("Azat", "Akimov", 23, "Driver");
            Driver driver4 = new Driver("Bakyt", "Temiirov", 40, "Driver");

            Driver[] drivers = new Driver[]{driver1, driver2, driver3, driver4};

            User user1 = new User();
            User registr = new User();
            User login = new User();
            login.setLogin("abs112");
            login.setPassword("123456789");

            User[] users = new User[]{user1};

            Management management = new Management(cars, drivers, users);
            Bank bank1 = new Bank();
            bank1.setBalans(100000);

            int counter = 0;
            for (Car a : cars) {
                counter++;
                System.out.println(counter + "." + a.getBrand() + " " + a.getModel());
            }
            System.out.println("Добро пожаловать\nВЫБЕРИТЕ МАРКУ МАШИНЫ, КОТОРУЮ ХОТЕЛИ БЫ ЗАБРОНИРОВАТЬ: ");
            System.out.println("Ваш выбор: ");
            int s = new Scanner(System.in).nextInt();

            if (s == 1) {
                System.out.println(car1.getBrand() + " " + car1.getModel() + " " + car1.getPrice());
                System.out.println("ВВЕДИТЕ ИМЯ");
                user1.setFirstName(new Scanner(System.in).nextLine());
                System.out.println("ВВЕДИТЕ АДРЕС");
                user1.setAdress(new Scanner(System.in).nextLine());
                System.out.println("ВВЕДИТЕ НОМЕР ТЕЛЕФОНА");
                user1.setPhoneNumber(new Scanner(System.in).nextLong());

                System.out.println("Чтобы оплатить войдите через свой акаунт или зарегистируйтесь");
                System.out.println("-----Регистрация или Логин --------\n(1/2)");
                int a = new Scanner(System.in).nextInt();
                if (a == 1) {
                    System.out.println("Введите логин: ");
                    registr.setLogin(new Scanner(System.in).nextLine());
                    System.out.println("Введите пароль: ");
                    registr.setPassword(new Scanner(System.in).nextLine());
                    System.out.println("1.Pay.\n" +
                            "2. Deposit.\n" +
                            "3. Transfer.\n" +
                            "4. Check balance.\n" +
                            "5. Withdraw\n" +
                            "6. Log out.");
                    int z = new Scanner(System.in).nextInt();
                    if (z == 1) {
                        if (car1.getPrice() <= bank1.getBalans()) {
                            user1.bookCar(car1);
                        } else {
                            System.out.println("У вас не хватаеть денги\nЧтобы пополнть баланс нажмите 1");
                            int x = new Scanner(System.in).nextInt();
                            switch (x) {
                                case 1:
                                    System.out.println("Введите сумму: ");
                                    bank1.deposit(new Scanner(System.in).nextInt());
                                    System.out.println("Вы успешно пополнили счеть\nMenu-->1");
                                    int v = new Scanner(System.in).nextInt();
                                    switch (v) {
                                        case 1:
                                            System.out.println("1.Pay.\n" +
                                                    "2. Deposit.\n" +
                                                    "3. Transfer.\n" +
                                                    "4. Check balance.\n" +
                                                    "5. Withdraw\n" +
                                                    "6. Log out.");
                                            int n = new Scanner(System.in).nextInt();
                                            switch (n) {
                                                case 1:
                                                    user1.bookCar(car1);
                                                    //System.out.println("ВЫ УСПЕШНО ВНЕСЛИ ОПЛАТУ");
                                                    break;
                                                case 2:
                                                    System.out.println("Введите сумму: ");
                                                    bank1.deposit(new Scanner(System.in).nextInt());
                                                    break;
                                                case 3:
                                                    System.out.println("Введите сумму: ");
                                                    bank1.transfer(new Scanner(System.in).nextInt());
                                                    break;
                                                case 4:
                                                    bank1.getBalans();
                                                    break;
                                                case 5:
                                                    System.out.println("Введите сумму: ");
                                                    bank1.withdraw(new Scanner(System.in).nextInt());
                                                    break;
                                                case 6:
                                                    break;
                                            }
                                            break;
                                        default:
                                            System.out.println("Error");
                                    }
                                    break;
                                default:
                                    System.out.println("Error");

                            }
                        }
                    }

                } else if (a == 2) {
                    System.out.println("Введите логин: ");
                    String b = new Scanner(System.in).nextLine();
                    System.out.println("Введите пароль");
                    String c = new Scanner(System.in).nextLine();

                    if (b.equals(login.getLogin()) && c.equals(login.getPassword())) {
                        System.out.println("1.Pay.\n" +
                                "2. Deposit.\n" +
                                "3. Transfer.\n" +
                                "4. Check balance.\n" +
                                "5. Withdraw\n" +
                                "6. Log out.");
                        int z = new Scanner(System.in).nextInt();
                        if (z == 1) {
                            if (car1.getPrice() <= bank1.getBalans()) {
                                System.out.println("ВЫ УСПЕШНО ВНЕСЛИ ОПЛАТУ");
                            } else {
                                System.out.println("У вас не хватаеть денги\nЧтобы пополнть баланс нажмите 1");
                                int x = new Scanner(System.in).nextInt();
                                switch (x) {
                                    case 1:
                                        System.out.println("Введите сумму: ");
                                        bank1.deposit(new Scanner(System.in).nextInt());
                                        System.out.println("Вы успешно пополнили счеть\nMenu-->1");
                                        int v = new Scanner(System.in).nextInt();
                                        switch (v) {
                                            case 1:
                                                System.out.println("1.Pay.\n" +
                                                        "2. Deposit.\n" +
                                                        "3. Transfer.\n" +
                                                        "4. Check balance.\n" +
                                                        "5. Withdraw\n" +
                                                        "6. Log out.");
                                                int n = new Scanner(System.in).nextInt();
                                                switch (n) {
                                                    case 1:
                                                        System.out.println("ВЫ УСПЕШНО ВНЕСЛИ ОПЛАТУ");
                                                        break;
                                                    case 2:
                                                        System.out.println("Введите сумму: ");
                                                        bank1.deposit(new Scanner(System.in).nextInt());
                                                        break;
                                                    case 3:
                                                        System.out.println("Введите сумму: ");
                                                        bank1.transfer(new Scanner(System.in).nextInt());
                                                        break;
                                                    case 4:
                                                        bank1.getBalans();
                                                        break;
                                                    case 5:
                                                        System.out.println("Введите сумму: ");
                                                        bank1.withdraw(new Scanner(System.in).nextInt());
                                                        break;
                                                    case 6:
                                                        break;
                                                }
                                                break;
                                            default:
                                                System.out.println("Error");
                                        }
                                        break;
                                    default:
                                        System.out.println("Error");

                                }
                            }
                        } else if (z == 2) {
                            System.out.println("Введите сумму: ");
                            bank1.deposit(new Scanner(System.in).nextInt());
                        } else if (z == 3) {
                            System.out.println("Введите сумму: ");
                            bank1.transfer(new Scanner(System.in).nextInt());
                        } else if (z == 4) {
                            bank1.getBalans();
                        } else if (z == 5) {
                            System.out.println("Введите сумму: ");
                            bank1.withdraw(new Scanner(System.in).nextInt());
                        } else if (z == 6) {

                        }
                    } else {
                        System.out.println("Неправильной пароль");
                    }
                }


            } else if (s == 2) {
                System.out.println(car2.getBrand() + " " + car2.getModel() + " " + car2.getPrice());
                System.out.println("ВВЕДИТЕ ИМЯ");
                user1.setFirstName(new Scanner(System.in).nextLine());
                System.out.println("ВВЕДИТЕ АДРЕС");
                user1.setAdress(new Scanner(System.in).nextLine());
                System.out.println("ВВЕДИТЕ НОМЕР ТЕЛЕФОНА");
                user1.setPhoneNumber(new Scanner(System.in).nextLong());

                System.out.println("Чтобы оплатить войдите через свой акаунт или зарегистируйтесь");
                System.out.println("-----Регистрация или Логин --------\n(1/2)");
                int a = new Scanner(System.in).nextInt();
                if (a == 1) {
                    System.out.println("Введите логин: ");
                    registr.setLogin(new Scanner(System.in).nextLine());
                    System.out.println("Введите пароль: ");
                    registr.setPassword(new Scanner(System.in).nextLine());
                    System.out.println("1.Pay.\n" +
                            "2. Deposit.\n" +
                            "3. Transfer.\n" +
                            "4. Check balance.\n" +
                            "5. Withdraw\n" +
                            "6. Log out.");
                    int z = new Scanner(System.in).nextInt();
                    if (z == 1) {
                        if (car2.getPrice() <= bank1.getBalans()) {
                            System.out.println("ВЫ УСПЕШНО ВНЕСЛИ ОПЛАТУ");
                        } else {
                            System.out.println("У вас не хватаеть денги\nЧтобы пополнть баланс нажмите 1");
                            int x = new Scanner(System.in).nextInt();
                            switch (x) {
                                case 1:
                                    System.out.println("Введите сумму: ");
                                    bank1.deposit(new Scanner(System.in).nextInt());
                                    System.out.println("Вы успешно пополнили счеть\nMenu-->1");
                                    int v = new Scanner(System.in).nextInt();
                                    switch (v) {
                                        case 1:
                                            System.out.println("1.Pay.\n" +
                                                    "2. Deposit.\n" +
                                                    "3. Transfer.\n" +
                                                    "4. Check balance.\n" +
                                                    "5. Withdraw\n" +
                                                    "6. Log out.");
                                            int n = new Scanner(System.in).nextInt();
                                            switch (n) {
                                                case 1:
                                                    System.out.println("Введите сумму: ");
                                                    bank1.pay(new Scanner(System.in).nextInt());
                                                    System.out.println("ВЫ УСПЕШНО ВНЕСЛИ ОПЛАТУ");
                                                    break;
                                                case 2:
                                                    System.out.println("Введите сумму: ");
                                                    bank1.deposit(new Scanner(System.in).nextInt());
                                                    break;
                                                case 3:
                                                    System.out.println("Введите сумму: ");
                                                    bank1.transfer(new Scanner(System.in).nextInt());
                                                    break;
                                                case 4:
                                                    bank1.getBalans();
                                                    break;
                                                case 5:
                                                    System.out.println("Введите сумму: ");
                                                    bank1.withdraw(new Scanner(System.in).nextInt());
                                                    break;
                                                case 6:
                                                    break;
                                            }
                                            break;
                                        default:
                                            System.out.println("Error");
                                    }
                                    break;
                                default:
                                    System.out.println("Error");

                            }
                        }
                    }

                } else if (a == 2) {
                    System.out.println("Введите логин: ");
                    String b = new Scanner(System.in).nextLine();
                    System.out.println("Введите пароль");
                    String c = new Scanner(System.in).nextLine();

                    if (b.equals(login.getLogin()) && c.equals(login.getPassword())) {
                        System.out.println("1.Pay.\n" +
                                "2. Deposit.\n" +
                                "3. Transfer.\n" +
                                "4. Check balance.\n" +
                                "5. Withdraw\n" +
                                "6. Log out.");
                        int z = new Scanner(System.in).nextInt();
                        if (z == 1) {
                            if (car2.getPrice() <= bank1.getBalans()) {
                                System.out.println("ВЫ УСПЕШНО ВНЕСЛИ ОПЛАТУ");
                            } else {
                                System.out.println("У вас не хватаеть денги\nЧтобы пополнть баланс нажмите 1");
                                int x = new Scanner(System.in).nextInt();
                                switch (x) {
                                    case 1:
                                        System.out.println("Введите сумму: ");
                                        bank1.deposit(new Scanner(System.in).nextInt());
                                        System.out.println("Вы успешно пополнили счеть\nMenu-->1");
                                        int v = new Scanner(System.in).nextInt();
                                        switch (v) {
                                            case 1:
                                                System.out.println("1.Pay.\n" +
                                                        "2. Deposit.\n" +
                                                        "3. Transfer.\n" +
                                                        "4. Check balance.\n" +
                                                        "5. Withdraw\n" +
                                                        "6. Log out.");
                                                int n = new Scanner(System.in).nextInt();
                                                switch (n) {
                                                    case 1:
                                                        System.out.println("Введите сумму: ");
                                                        bank1.pay(new Scanner(System.in).nextInt());
                                                        System.out.println("ВЫ УСПЕШНО ВНЕСЛИ ОПЛАТУ");
                                                        break;
                                                    case 2:
                                                        System.out.println("Введите сумму: ");
                                                        bank1.deposit(new Scanner(System.in).nextInt());
                                                        break;
                                                    case 3:
                                                        System.out.println("Введите сумму: ");
                                                        bank1.transfer(new Scanner(System.in).nextInt());
                                                        break;
                                                    case 4:
                                                        bank1.getBalans();
                                                        break;
                                                    case 5:
                                                        System.out.println("Введите сумму: ");
                                                        bank1.withdraw(new Scanner(System.in).nextInt());
                                                        break;
                                                    case 6:
                                                        break;
                                                }
                                                break;
                                            default:
                                                System.out.println("Error");
                                        }
                                        break;
                                    default:
                                        System.out.println("Error");

                                }
                            }
                        } else if (z == 2) {
                            System.out.println("Введите сумму: ");
                            bank1.deposit(new Scanner(System.in).nextInt());
                        } else if (z == 3) {
                            System.out.println("Введите сумму: ");
                            bank1.transfer(new Scanner(System.in).nextInt());
                        } else if (z == 4) {
                            bank1.getBalans();
                        } else if (z == 5) {
                            System.out.println("Введите сумму: ");
                            bank1.withdraw(new Scanner(System.in).nextInt());
                        } else if (z == 6) {

                        }
                    } else {
                        System.out.println("Неправильной пароль");
                    }
                }


            } else if (s == 3) {
                System.out.println(car3.getBrand() + " " + car3.getModel() + " " + car3.getPrice());
                System.out.println("ВВЕДИТЕ ИМЯ");
                user1.setFirstName(new Scanner(System.in).nextLine());
                System.out.println("ВВЕДИТЕ АДРЕС");
                user1.setAdress(new Scanner(System.in).nextLine());
                System.out.println("ВВЕДИТЕ НОМЕР ТЕЛЕФОНА");
                user1.setPhoneNumber(new Scanner(System.in).nextLong());

                System.out.println("Чтобы оплатить войдите через свой акаунт или зарегистируйтесь");
                System.out.println("-----Регистрация или Логин --------\n(1/2)");
                int a = new Scanner(System.in).nextInt();
                if (a == 1) {
                    System.out.println("Введите логин: ");
                    registr.setLogin(new Scanner(System.in).nextLine());
                    System.out.println("Введите пароль: ");
                    registr.setPassword(new Scanner(System.in).nextLine());
                    System.out.println("1.Pay.\n" +
                            "2. Deposit.\n" +
                            "3. Transfer.\n" +
                            "4. Check balance.\n" +
                            "5. Withdraw\n" +
                            "6. Log out.");
                    int z = new Scanner(System.in).nextInt();
                    if (z == 1) {
                        if (car3.getPrice() <= bank1.getBalans()) {
                            System.out.println("ВЫ УСПЕШНО ВНЕСЛИ ОПЛАТУ");
                        } else {
                            System.out.println("У вас не хватаеть денги\nЧтобы пополнть баланс нажмите 1");
                            int x = new Scanner(System.in).nextInt();
                            switch (x) {
                                case 1:
                                    System.out.println("Введите сумму: ");
                                    bank1.deposit(new Scanner(System.in).nextInt());
                                    System.out.println("Вы успешно пополнили счеть\nMenu-->1");
                                    int v = new Scanner(System.in).nextInt();
                                    switch (v) {
                                        case 1:
                                            System.out.println("1.Pay.\n" +
                                                    "2. Deposit.\n" +
                                                    "3. Transfer.\n" +
                                                    "4. Check balance.\n" +
                                                    "5. Withdraw\n" +
                                                    "6. Log out.");
                                            int n = new Scanner(System.in).nextInt();
                                            switch (n) {
                                                case 1:
                                                    System.out.println("Введите сумму: ");
                                                    bank1.pay(new Scanner(System.in).nextInt());
                                                    System.out.println("ВЫ УСПЕШНО ВНЕСЛИ ОПЛАТУ");
                                                    break;
                                                case 2:
                                                    System.out.println("Введите сумму: ");
                                                    bank1.deposit(new Scanner(System.in).nextInt());
                                                    break;
                                                case 3:
                                                    System.out.println("Введите сумму: ");
                                                    bank1.transfer(new Scanner(System.in).nextInt());
                                                    break;
                                                case 4:
                                                    bank1.getBalans();
                                                    break;
                                                case 5:
                                                    System.out.println("Введите сумму: ");
                                                    bank1.withdraw(new Scanner(System.in).nextInt());
                                                    break;
                                                case 6:
                                                    break;
                                            }
                                            break;
                                        default:
                                            System.out.println("Error");
                                    }
                                    break;
                                default:
                                    System.out.println("Error");

                            }
                        }
                    }

                } else if (a == 2) {
                    System.out.println("Введите логин: ");
                    String b = new Scanner(System.in).nextLine();
                    System.out.println("Введите пароль");
                    String c = new Scanner(System.in).nextLine();

                    if (b.equals(login.getLogin()) && c.equals(login.getPassword())) {
                        System.out.println("1.Pay.\n" +
                                "2. Deposit.\n" +
                                "3. Transfer.\n" +
                                "4. Check balance.\n" +
                                "5. Withdraw\n" +
                                "6. Log out.");
                        int z = new Scanner(System.in).nextInt();
                        if (z == 1) {
                            if (car3.getPrice() <= bank1.getBalans()) {
                                System.out.println("ВЫ УСПЕШНО ВНЕСЛИ ОПЛАТУ");
                            } else {
                                System.out.println("У вас не хватаеть денги\nЧтобы пополнть баланс нажмите 1");
                                int x = new Scanner(System.in).nextInt();
                                switch (x) {
                                    case 1:
                                        System.out.println("Введите сумму: ");
                                        bank1.deposit(new Scanner(System.in).nextInt());
                                        System.out.println("Вы успешно пополнили счеть\nMenu-->1");
                                        int v = new Scanner(System.in).nextInt();
                                        switch (v) {
                                            case 1:
                                                System.out.println("1.Pay.\n" +
                                                        "2. Deposit.\n" +
                                                        "3. Transfer.\n" +
                                                        "4. Check balance.\n" +
                                                        "5. Withdraw\n" +
                                                        "6. Log out.");
                                                int n = new Scanner(System.in).nextInt();
                                                switch (n) {
                                                    case 1:
                                                        System.out.println("Введите сумму: ");
                                                        bank1.pay(new Scanner(System.in).nextInt());
                                                        System.out.println("ВЫ УСПЕШНО ВНЕСЛИ ОПЛАТУ");
                                                        break;
                                                    case 2:
                                                        System.out.println("Введите сумму: ");
                                                        bank1.deposit(new Scanner(System.in).nextInt());
                                                        break;
                                                    case 3:
                                                        System.out.println("Введите сумму: ");
                                                        bank1.transfer(new Scanner(System.in).nextInt());
                                                        break;
                                                    case 4:
                                                        bank1.getBalans();
                                                        break;
                                                    case 5:
                                                        System.out.println("Введите сумму: ");
                                                        bank1.withdraw(new Scanner(System.in).nextInt());
                                                        break;
                                                    case 6:
                                                        break;
                                                }
                                                break;
                                            default:
                                                System.out.println("Error");
                                        }
                                        break;
                                    default:
                                        System.out.println("Error");

                                }
                            }
                        } else if (z == 2) {
                            System.out.println("Введите сумму: ");
                            bank1.deposit(new Scanner(System.in).nextInt());
                        } else if (z == 3) {
                            System.out.println("Введите сумму: ");
                            bank1.transfer(new Scanner(System.in).nextInt());
                        } else if (z == 4) {
                            bank1.getBalans();
                        } else if (z == 5) {
                            System.out.println("Введите сумму: ");
                            bank1.withdraw(new Scanner(System.in).nextInt());
                        } else if (z == 6) {

                        }
                    } else {
                        System.out.println("Неправильной пароль");
                    }
                }


            } else if (s == 4) {
                System.out.println(car4.getBrand() + " " + car4.getModel() + " " + car4.getPrice());
                System.out.println("ВВЕДИТЕ ИМЯ");
                user1.setFirstName(new Scanner(System.in).nextLine());
                System.out.println("ВВЕДИТЕ АДРЕС");
                user1.setAdress(new Scanner(System.in).nextLine());
                System.out.println("ВВЕДИТЕ НОМЕР ТЕЛЕФОНА");
                user1.setPhoneNumber(new Scanner(System.in).nextLong());

                System.out.println("Чтобы оплатить войдите через свой акаунт или зарегистируйтесь");
                System.out.println("-----Регистрация или Логин --------\n(1/2)");
                int a = new Scanner(System.in).nextInt();
                if (a == 1) {
                    System.out.println("Введите логин: ");
                    registr.setLogin(new Scanner(System.in).nextLine());
                    System.out.println("Введите пароль: ");
                    registr.setPassword(new Scanner(System.in).nextLine());
                    System.out.println("1.Pay.\n" +
                            "2. Deposit.\n" +
                            "3. Transfer.\n" +
                            "4. Check balance.\n" +
                            "5. Withdraw\n" +
                            "6. Log out.");
                    int z = new Scanner(System.in).nextInt();
                    if (z == 1) {
                        if (car4.getPrice() <= bank1.getBalans()) {
                            System.out.println("ВЫ УСПЕШНО ВНЕСЛИ ОПЛАТУ");
                        } else {
                            System.out.println("У вас не хватаеть денги\nЧтобы пополнть баланс нажмите 1");
                            int x = new Scanner(System.in).nextInt();
                            switch (x) {
                                case 1:
                                    System.out.println("Введите сумму: ");
                                    bank1.deposit(new Scanner(System.in).nextInt());
                                    System.out.println("Вы успешно пополнили счеть\nMenu-->1");
                                    int v = new Scanner(System.in).nextInt();
                                    switch (v) {
                                        case 1:
                                            System.out.println("1.Pay.\n" +
                                                    "2. Deposit.\n" +
                                                    "3. Transfer.\n" +
                                                    "4. Check balance.\n" +
                                                    "5. Withdraw\n" +
                                                    "6. Log out.");
                                            int n = new Scanner(System.in).nextInt();
                                            switch (n) {
                                                case 1:
                                                    System.out.println("Введите сумму: ");
                                                    bank1.pay(new Scanner(System.in).nextInt());
                                                    System.out.println("ВЫ УСПЕШНО ВНЕСЛИ ОПЛАТУ");
                                                    break;
                                                case 2:
                                                    System.out.println("Введите сумму: ");
                                                    bank1.deposit(new Scanner(System.in).nextInt());
                                                    break;
                                                case 3:
                                                    System.out.println("Введите сумму: ");
                                                    bank1.transfer(new Scanner(System.in).nextInt());
                                                    break;
                                                case 4:
                                                    bank1.getBalans();
                                                    break;
                                                case 5:
                                                    System.out.println("Введите сумму: ");
                                                    bank1.withdraw(new Scanner(System.in).nextInt());
                                                    break;
                                                case 6:
                                                    break;
                                            }
                                            break;
                                        default:
                                            System.out.println("Error");
                                    }
                                    break;
                                default:
                                    System.out.println("Error");

                            }
                        }
                    }

                } else if (a == 2) {
                    System.out.println("Введите логин: ");
                    String b = new Scanner(System.in).nextLine();
                    System.out.println("Введите пароль");
                    String c = new Scanner(System.in).nextLine();

                    if (b.equals(login.getLogin()) && c.equals(login.getPassword())) {
                        System.out.println("1.Pay.\n" +
                                "2. Deposit.\n" +
                                "3. Transfer.\n" +
                                "4. Check balance.\n" +
                                "5. Withdraw\n" +
                                "6. Log out.");
                        int z = new Scanner(System.in).nextInt();
                        if (z == 1) {
                            if (car4.getPrice() <= bank1.getBalans()) {
                                System.out.println("ВЫ УСПЕШНО ВНЕСЛИ ОПЛАТУ");
                            } else {
                                System.out.println("У вас не хватаеть денги\nЧтобы пополнть баланс нажмите 1");
                                int x = new Scanner(System.in).nextInt();
                                switch (x) {
                                    case 1:
                                        System.out.println("Введите сумму: ");
                                        bank1.deposit(new Scanner(System.in).nextInt());
                                        System.out.println("Вы успешно пополнили счеть\nMenu-->1");
                                        int v = new Scanner(System.in).nextInt();
                                        switch (v) {
                                            case 1:
                                                System.out.println("1.Pay.\n" +
                                                        "2. Deposit.\n" +
                                                        "3. Transfer.\n" +
                                                        "4. Check balance.\n" +
                                                        "5. Withdraw\n" +
                                                        "6. Log out.");
                                                int n = new Scanner(System.in).nextInt();
                                                switch (n) {
                                                    case 1:
                                                        System.out.println("Введите сумму: ");
                                                        bank1.pay(new Scanner(System.in).nextInt());
                                                        System.out.println("ВЫ УСПЕШНО ВНЕСЛИ ОПЛАТУ");
                                                        break;
                                                    case 2:
                                                        System.out.println("Введите сумму: ");
                                                        bank1.deposit(new Scanner(System.in).nextInt());
                                                        break;
                                                    case 3:
                                                        System.out.println("Введите сумму: ");
                                                        bank1.transfer(new Scanner(System.in).nextInt());
                                                        break;
                                                    case 4:
                                                        bank1.getBalans();
                                                        break;
                                                    case 5:
                                                        System.out.println("Введите сумму: ");
                                                        bank1.withdraw(new Scanner(System.in).nextInt());
                                                        break;
                                                    case 6:
                                                        break;
                                                }
                                                break;
                                            default:
                                                System.out.println("Error");
                                        }
                                        break;
                                    default:
                                        System.out.println("Error");

                                }
                            }
                        } else if (z == 2) {
                            System.out.println("Введите сумму: ");
                            bank1.deposit(new Scanner(System.in).nextInt());
                        } else if (z == 3) {
                            System.out.println("Введите сумму: ");
                            bank1.transfer(new Scanner(System.in).nextInt());
                        } else if (z == 4) {
                            bank1.getBalans();
                        } else if (z == 5) {
                            System.out.println("Введите сумму: ");
                            bank1.withdraw(new Scanner(System.in).nextInt());
                        } else if (z == 6) {

                        }
                    } else {
                        System.out.println("Неправильной пароль");
                    }
                }


            } else if (s == 5) {
                System.out.println(car5.getBrand() + " " + car5.getModel() + " " + car5.getPrice());
                System.out.println("ВВЕДИТЕ ИМЯ");
                user1.setFirstName(new Scanner(System.in).nextLine());
                System.out.println("ВВЕДИТЕ АДРЕС");
                user1.setAdress(new Scanner(System.in).nextLine());
                System.out.println("ВВЕДИТЕ НОМЕР ТЕЛЕФОНА");
                user1.setPhoneNumber(new Scanner(System.in).nextLong());

                System.out.println("Чтобы оплатить войдите через свой акаунт или зарегистируйтесь");
                System.out.println("-----Регистрация или Логин --------\n(1/2)");
                int a = new Scanner(System.in).nextInt();
                if (a == 1) {
                    System.out.println("Введите логин: ");
                    registr.setLogin(new Scanner(System.in).nextLine());
                    System.out.println("Введите пароль: ");
                    registr.setPassword(new Scanner(System.in).nextLine());
                    System.out.println("1.Pay.\n" +
                            "2. Deposit.\n" +
                            "3. Transfer.\n" +
                            "4. Check balance.\n" +
                            "5. Withdraw\n" +
                            "6. Log out.");
                    int z = new Scanner(System.in).nextInt();
                    if (z == 1) {
                        if (car5.getPrice() <= bank1.getBalans()) {
                            System.out.println("ВЫ УСПЕШНО ВНЕСЛИ ОПЛАТУ");
                        } else {
                            System.out.println("У вас не хватаеть денги\nЧтобы пополнть баланс нажмите 1");
                            int x = new Scanner(System.in).nextInt();
                            switch (x) {
                                case 1:
                                    System.out.println("Введите сумму: ");
                                    bank1.deposit(new Scanner(System.in).nextInt());
                                    System.out.println("Вы успешно пополнили счеть\nMenu-->1");
                                    int v = new Scanner(System.in).nextInt();
                                    switch (v) {
                                        case 1:
                                            System.out.println("1.Pay.\n" +
                                                    "2. Deposit.\n" +
                                                    "3. Transfer.\n" +
                                                    "4. Check balance.\n" +
                                                    "5. Withdraw\n" +
                                                    "6. Log out.");
                                            int n = new Scanner(System.in).nextInt();
                                            switch (n) {
                                                case 1:
                                                    System.out.println("Введите сумму: ");
                                                    bank1.pay(new Scanner(System.in).nextInt());
                                                    System.out.println("ВЫ УСПЕШНО ВНЕСЛИ ОПЛАТУ");
                                                    break;
                                                case 2:
                                                    System.out.println("Введите сумму: ");
                                                    bank1.deposit(new Scanner(System.in).nextInt());
                                                    break;
                                                case 3:
                                                    System.out.println("Введите сумму: ");
                                                    bank1.transfer(new Scanner(System.in).nextInt());
                                                    break;
                                                case 4:
                                                    bank1.getBalans();
                                                    break;
                                                case 5:
                                                    System.out.println("Введите сумму: ");
                                                    bank1.withdraw(new Scanner(System.in).nextInt());
                                                    break;
                                                case 6:
                                                    break;
                                            }
                                            break;
                                        default:
                                            System.out.println("Error");
                                    }
                                    break;
                                default:
                                    System.out.println("Error");

                            }
                        }
                    }

                } else if (a == 2) {
                    System.out.println("Введите логин: ");
                    String b = new Scanner(System.in).nextLine();
                    System.out.println("Введите пароль");
                    String c = new Scanner(System.in).nextLine();

                    if (b.equals(login.getLogin()) && c.equals(login.getPassword())) {
                        System.out.println("1.Pay.\n" +
                                "2. Deposit.\n" +
                                "3. Transfer.\n" +
                                "4. Check balance.\n" +
                                "5. Withdraw\n" +
                                "6. Log out.");
                        int z = new Scanner(System.in).nextInt();
                        if (z == 1) {
                            if (car5.getPrice() <= bank1.getBalans()) {
                                System.out.println("ВЫ УСПЕШНО ВНЕСЛИ ОПЛАТУ");
                            } else {
                                System.out.println("У вас не хватаеть денги\nЧтобы пополнть баланс нажмите 1");
                                int x = new Scanner(System.in).nextInt();
                                switch (x) {
                                    case 1:
                                        System.out.println("Введите сумму: ");
                                        bank1.deposit(new Scanner(System.in).nextInt());
                                        System.out.println("Вы успешно пополнили счеть\nMenu-->1");
                                        int v = new Scanner(System.in).nextInt();
                                        switch (v) {
                                            case 1:
                                                System.out.println("1.Pay.\n" +
                                                        "2. Deposit.\n" +
                                                        "3. Transfer.\n" +
                                                        "4. Check balance.\n" +
                                                        "5. Withdraw\n" +
                                                        "6. Log out.");
                                                int n = new Scanner(System.in).nextInt();
                                                switch (n) {
                                                    case 1:
                                                        System.out.println("Введите сумму: ");
                                                        bank1.pay(new Scanner(System.in).nextInt());
                                                        System.out.println("ВЫ УСПЕШНО ВНЕСЛИ ОПЛАТУ");
                                                        break;
                                                    case 2:
                                                        System.out.println("Введите сумму: ");
                                                        bank1.deposit(new Scanner(System.in).nextInt());
                                                        break;
                                                    case 3:
                                                        System.out.println("Введите сумму: ");
                                                        bank1.transfer(new Scanner(System.in).nextInt());
                                                        break;
                                                    case 4:
                                                        bank1.getBalans();
                                                        break;
                                                    case 5:
                                                        System.out.println("Введите сумму: ");
                                                        bank1.withdraw(new Scanner(System.in).nextInt());
                                                        break;
                                                    case 6:
                                                        break;
                                                }
                                                break;
                                            default:
                                                System.out.println("Error");
                                        }
                                        break;
                                    default:
                                        System.out.println("Error");

                                }
                            }
                        } else if (z == 2) {
                            System.out.println("Введите сумму: ");
                            bank1.deposit(new Scanner(System.in).nextInt());
                        } else if (z == 3) {
                            System.out.println("Введите сумму: ");
                            bank1.transfer(new Scanner(System.in).nextInt());
                        } else if (z == 4) {
                            bank1.getBalans();
                        } else if (z == 5) {
                            System.out.println("Введите сумму: ");
                            bank1.withdraw(new Scanner(System.in).nextInt());
                        } else if (z == 6) {

                        }
                    } else {
                        System.out.println("Неправильной пароль");
                    }
                }


            } else if (s == 6) {
                System.out.println(car6.getBrand() + " " + car6.getModel() + " " + car6.getPrice());
                System.out.println("ВВЕДИТЕ ИМЯ");
                user1.setFirstName(new Scanner(System.in).nextLine());
                System.out.println("ВВЕДИТЕ АДРЕС");
                user1.setAdress(new Scanner(System.in).nextLine());
                System.out.println("ВВЕДИТЕ НОМЕР ТЕЛЕФОНА");
                user1.setPhoneNumber(new Scanner(System.in).nextLong());

                System.out.println("Чтобы оплатить войдите через свой акаунт или зарегистируйтесь");
                System.out.println("-----Регистрация или Логин --------\n(1/2)");
                int a = new Scanner(System.in).nextInt();
                if (a == 1) {
                    System.out.println("Введите логин: ");
                    registr.setLogin(new Scanner(System.in).nextLine());
                    System.out.println("Введите пароль: ");
                    registr.setPassword(new Scanner(System.in).nextLine());
                    System.out.println("1.Pay.\n" +
                            "2. Deposit.\n" +
                            "3. Transfer.\n" +
                            "4. Check balance.\n" +
                            "5. Withdraw\n" +
                            "6. Log out.");
                    int z = new Scanner(System.in).nextInt();
                    if (z == 1) {
                        if (car6.getPrice() <= bank1.getBalans()) {
                            System.out.println("ВЫ УСПЕШНО ВНЕСЛИ ОПЛАТУ");
                        } else {
                            System.out.println("У вас не хватаеть денги\nЧтобы пополнть баланс нажмите 1");
                            int x = new Scanner(System.in).nextInt();
                            switch (x) {
                                case 1:
                                    System.out.println("Введите сумму: ");
                                    bank1.deposit(new Scanner(System.in).nextInt());
                                    System.out.println("Вы успешно пополнили счеть\nMenu-->1");
                                    int v = new Scanner(System.in).nextInt();
                                    switch (v) {
                                        case 1:
                                            System.out.println("1.Pay.\n" +
                                                    "2. Deposit.\n" +
                                                    "3. Transfer.\n" +
                                                    "4. Check balance.\n" +
                                                    "5. Withdraw\n" +
                                                    "6. Log out.");
                                            int n = new Scanner(System.in).nextInt();
                                            switch (n) {
                                                case 1:
                                                    System.out.println("Введите сумму: ");
                                                    bank1.pay(new Scanner(System.in).nextInt());
                                                    System.out.println("ВЫ УСПЕШНО ВНЕСЛИ ОПЛАТУ");
                                                    break;
                                                case 2:
                                                    System.out.println("Введите сумму: ");
                                                    bank1.deposit(new Scanner(System.in).nextInt());
                                                    break;
                                                case 3:
                                                    System.out.println("Введите сумму: ");
                                                    bank1.transfer(new Scanner(System.in).nextInt());
                                                    break;
                                                case 4:
                                                    bank1.getBalans();
                                                    break;
                                                case 5:
                                                    System.out.println("Введите сумму: ");
                                                    bank1.withdraw(new Scanner(System.in).nextInt());
                                                    break;
                                                case 6:
                                                    break;
                                            }
                                            break;
                                        default:
                                            System.out.println("Error");
                                    }
                                    break;
                                default:
                                    System.out.println("Error");

                            }
                        }
                    }

                } else if (a == 2) {
                    System.out.println("Введите логин: ");
                    String b = new Scanner(System.in).nextLine();
                    System.out.println("Введите пароль");
                    String c = new Scanner(System.in).nextLine();

                    if (b.equals(login.getLogin()) && c.equals(login.getPassword())) {
                        System.out.println("1.Pay.\n" +
                                "2. Deposit.\n" +
                                "3. Transfer.\n" +
                                "4. Check balance.\n" +
                                "5. Withdraw\n" +
                                "6. Log out.");
                        int z = new Scanner(System.in).nextInt();
                        if (z == 1) {
                            if (car6.getPrice() <= bank1.getBalans()) {
                                System.out.println("ВЫ УСПЕШНО ВНЕСЛИ ОПЛАТУ");
                            } else {
                                System.out.println("У вас не хватаеть денги\nЧтобы пополнть баланс нажмите 1");
                                int x = new Scanner(System.in).nextInt();
                                switch (x) {
                                    case 1:
                                        System.out.println("Введите сумму: ");
                                        bank1.deposit(new Scanner(System.in).nextInt());
                                        System.out.println("Вы успешно пополнили счеть\nMenu-->1");
                                        int v = new Scanner(System.in).nextInt();
                                        switch (v) {
                                            case 1:
                                                System.out.println("1.Pay.\n" +
                                                        "2. Deposit.\n" +
                                                        "3. Transfer.\n" +
                                                        "4. Check balance.\n" +
                                                        "5. Withdraw\n" +
                                                        "6. Log out.");
                                                int n = new Scanner(System.in).nextInt();
                                                switch (n) {
                                                    case 1:
                                                        System.out.println("Введите сумму: ");
                                                        bank1.pay(new Scanner(System.in).nextInt());
                                                        System.out.println("ВЫ УСПЕШНО ВНЕСЛИ ОПЛАТУ");
                                                        break;
                                                    case 2:
                                                        System.out.println("Введите сумму: ");
                                                        bank1.deposit(new Scanner(System.in).nextInt());
                                                        break;
                                                    case 3:
                                                        System.out.println("Введите сумму: ");
                                                        bank1.transfer(new Scanner(System.in).nextInt());
                                                        break;
                                                    case 4:
                                                        bank1.getBalans();
                                                        break;
                                                    case 5:
                                                        System.out.println("Введите сумму: ");
                                                        bank1.withdraw(new Scanner(System.in).nextInt());
                                                        break;
                                                    case 6:
                                                        break;
                                                }
                                                break;
                                            default:
                                                System.out.println("Error");
                                        }
                                        break;
                                    default:
                                        System.out.println("Error");

                                }
                            }
                        } else if (z == 2) {
                            System.out.println("Введите сумму: ");
                            bank1.deposit(new Scanner(System.in).nextInt());
                        } else if (z == 3) {
                            System.out.println("Введите сумму: ");
                            bank1.transfer(new Scanner(System.in).nextInt());
                        } else if (z == 4) {
                            bank1.getBalans();
                        } else if (z == 5) {
                            System.out.println("Введите сумму: ");
                            bank1.withdraw(new Scanner(System.in).nextInt());
                        } else if (z == 6) {

                        }
                    } else {
                        System.out.println("Неправильной пароль");
                    }
                }


            } else if (s == 7) {
                System.out.println(car7.getBrand() + " " + car7.getModel() + " " + car7.getPrice());
                System.out.println("ВВЕДИТЕ ИМЯ");
                user1.setFirstName(new Scanner(System.in).nextLine());
                System.out.println("ВВЕДИТЕ АДРЕС");
                user1.setAdress(new Scanner(System.in).nextLine());
                System.out.println("ВВЕДИТЕ НОМЕР ТЕЛЕФОНА");
                user1.setPhoneNumber(new Scanner(System.in).nextLong());

                System.out.println("Чтобы оплатить войдите через свой акаунт или зарегистируйтесь");
                System.out.println("-----Регистрация или Логин --------\n(1/2)");
                int a = new Scanner(System.in).nextInt();
                if (a == 1) {
                    System.out.println("Введите логин: ");
                    registr.setLogin(new Scanner(System.in).nextLine());
                    System.out.println("Введите пароль: ");
                    registr.setPassword(new Scanner(System.in).nextLine());
                    System.out.println("1.Pay.\n" +
                            "2. Deposit.\n" +
                            "3. Transfer.\n" +
                            "4. Check balance.\n" +
                            "5. Withdraw\n" +
                            "6. Log out.");
                    int z = new Scanner(System.in).nextInt();
                    if (z == 1) {
                        if (car7.getPrice() <= bank1.getBalans()) {
                            System.out.println("ВЫ УСПЕШНО ВНЕСЛИ ОПЛАТУ");
                        } else {
                            System.out.println("У вас не хватаеть денги\nЧтобы пополнть баланс нажмите 1");
                            int x = new Scanner(System.in).nextInt();
                            switch (x) {
                                case 1:
                                    System.out.println("Введите сумму: ");
                                    bank1.deposit(new Scanner(System.in).nextInt());
                                    System.out.println("Вы успешно пополнили счеть\nMenu-->1");
                                    int v = new Scanner(System.in).nextInt();
                                    switch (v) {
                                        case 1:
                                            System.out.println("1.Pay.\n" +
                                                    "2. Deposit.\n" +
                                                    "3. Transfer.\n" +
                                                    "4. Check balance.\n" +
                                                    "5. Withdraw\n" +
                                                    "6. Log out.");
                                            int n = new Scanner(System.in).nextInt();
                                            switch (n) {
                                                case 1:
                                                    System.out.println("Введите сумму: ");
                                                    bank1.pay(new Scanner(System.in).nextInt());
                                                    System.out.println("ВЫ УСПЕШНО ВНЕСЛИ ОПЛАТУ");
                                                    break;
                                                case 2:
                                                    System.out.println("Введите сумму: ");
                                                    bank1.deposit(new Scanner(System.in).nextInt());
                                                    break;
                                                case 3:
                                                    System.out.println("Введите сумму: ");
                                                    bank1.transfer(new Scanner(System.in).nextInt());
                                                    break;
                                                case 4:
                                                    bank1.getBalans();
                                                    break;
                                                case 5:
                                                    System.out.println("Введите сумму: ");
                                                    bank1.withdraw(new Scanner(System.in).nextInt());
                                                    break;
                                                case 6:
                                                    break;
                                            }
                                            break;
                                        default:
                                            System.out.println("Error");
                                    }
                                    break;
                                default:
                                    System.out.println("Error");

                            }
                        }
                    }

                } else if (a == 2) {
                    System.out.println("Введите логин: ");
                    String b = new Scanner(System.in).nextLine();
                    System.out.println("Введите пароль");
                    String c = new Scanner(System.in).nextLine();

                    if (b.equals(login.getLogin()) && c.equals(login.getPassword())) {
                        System.out.println("1.Pay.\n" +
                                "2. Deposit.\n" +
                                "3. Transfer.\n" +
                                "4. Check balance.\n" +
                                "5. Withdraw\n" +
                                "6. Log out.");
                        int z = new Scanner(System.in).nextInt();
                        if (z == 1) {
                            if (car7.getPrice() <= bank1.getBalans()) {
                                System.out.println("ВЫ УСПЕШНО ВНЕСЛИ ОПЛАТУ");
                            } else {
                                System.out.println("У вас не хватаеть денги\nЧтобы пополнть баланс нажмите 1");
                                int x = new Scanner(System.in).nextInt();
                                switch (x) {
                                    case 1:
                                        System.out.println("Введите сумму: ");
                                        bank1.deposit(new Scanner(System.in).nextInt());
                                        System.out.println("Вы успешно пополнили счеть\nMenu-->1");
                                        int v = new Scanner(System.in).nextInt();
                                        switch (v) {
                                            case 1:
                                                System.out.println("1.Pay.\n" +
                                                        "2. Deposit.\n" +
                                                        "3. Transfer.\n" +
                                                        "4. Check balance.\n" +
                                                        "5. Withdraw\n" +
                                                        "6. Log out.");
                                                int n = new Scanner(System.in).nextInt();
                                                switch (n) {
                                                    case 1:
                                                        System.out.println("Введите сумму: ");
                                                        bank1.pay(new Scanner(System.in).nextInt());
                                                        System.out.println("ВЫ УСПЕШНО ВНЕСЛИ ОПЛАТУ");
                                                        break;
                                                    case 2:
                                                        System.out.println("Введите сумму: ");
                                                        bank1.deposit(new Scanner(System.in).nextInt());
                                                        break;
                                                    case 3:
                                                        System.out.println("Введите сумму: ");
                                                        bank1.transfer(new Scanner(System.in).nextInt());
                                                        break;
                                                    case 4:
                                                        bank1.getBalans();
                                                        break;
                                                    case 5:
                                                        System.out.println("Введите сумму: ");
                                                        bank1.withdraw(new Scanner(System.in).nextInt());
                                                        break;
                                                    case 6:
                                                        break;
                                                }
                                                break;
                                            default:
                                                System.out.println("Error");
                                        }
                                        break;
                                    default:
                                        System.out.println("Error");

                                }
                            }
                        } else if (z == 2) {
                            System.out.println("Введите сумму: ");
                            bank1.deposit(new Scanner(System.in).nextInt());
                        } else if (z == 3) {
                            System.out.println("Введите сумму: ");
                            bank1.transfer(new Scanner(System.in).nextInt());
                        } else if (z == 4) {
                            bank1.getBalans();
                        } else if (z == 5) {
                            System.out.println("Введите сумму: ");
                            bank1.withdraw(new Scanner(System.in).nextInt());
                        } else if (z == 6) {

                        }
                    } else {
                        System.out.println("Неправильной пароль");
                    }
                }


            } else if (s == 8) {
                System.out.println(car8.getBrand() + " " + car8.getModel() + " " + car8.getPrice());
                System.out.println("ВВЕДИТЕ ИМЯ");
                user1.setFirstName(new Scanner(System.in).nextLine());
                System.out.println("ВВЕДИТЕ АДРЕС");
                user1.setAdress(new Scanner(System.in).nextLine());
                System.out.println("ВВЕДИТЕ НОМЕР ТЕЛЕФОНА");
                user1.setPhoneNumber(new Scanner(System.in).nextLong());

                System.out.println("Чтобы оплатить войдите через свой акаунт или зарегистируйтесь");
                System.out.println("-----Регистрация или Логин --------\n(1/2)");
                int a = new Scanner(System.in).nextInt();
                if (a == 1) {
                    System.out.println("Введите логин: ");
                    registr.setLogin(new Scanner(System.in).nextLine());
                    System.out.println("Введите пароль: ");
                    registr.setPassword(new Scanner(System.in).nextLine());
                    System.out.println("1.Pay.\n" +
                            "2. Deposit.\n" +
                            "3. Transfer.\n" +
                            "4. Check balance.\n" +
                            "5. Withdraw\n" +
                            "6. Log out.");
                    int z = new Scanner(System.in).nextInt();
                    if (z == 1) {
                        if (car8.getPrice() <= bank1.getBalans()) {
                            System.out.println("ВЫ УСПЕШНО ВНЕСЛИ ОПЛАТУ");
                        } else {
                            System.out.println("У вас не хватаеть денги\nЧтобы пополнть баланс нажмите 1");
                            int x = new Scanner(System.in).nextInt();
                            switch (x) {
                                case 1:
                                    System.out.println("Введите сумму: ");
                                    bank1.deposit(new Scanner(System.in).nextInt());
                                    System.out.println("Вы успешно пополнили счеть\nMenu-->1");
                                    int v = new Scanner(System.in).nextInt();
                                    switch (v) {
                                        case 1:
                                            System.out.println("1.Pay.\n" +
                                                    "2. Deposit.\n" +
                                                    "3. Transfer.\n" +
                                                    "4. Check balance.\n" +
                                                    "5. Withdraw\n" +
                                                    "6. Log out.");
                                            int n = new Scanner(System.in).nextInt();
                                            switch (n) {
                                                case 1:
                                                    System.out.println("Введите сумму: ");
                                                    bank1.pay(new Scanner(System.in).nextInt());
                                                    System.out.println("ВЫ УСПЕШНО ВНЕСЛИ ОПЛАТУ");
                                                    break;
                                                case 2:
                                                    System.out.println("Введите сумму: ");
                                                    bank1.deposit(new Scanner(System.in).nextInt());
                                                    break;
                                                case 3:
                                                    System.out.println("Введите сумму: ");
                                                    bank1.transfer(new Scanner(System.in).nextInt());
                                                    break;
                                                case 4:
                                                    bank1.getBalans();
                                                    break;
                                                case 5:
                                                    System.out.println("Введите сумму: ");
                                                    bank1.withdraw(new Scanner(System.in).nextInt());
                                                    break;
                                                case 6:
                                                    break;
                                            }
                                            break;
                                        default:
                                            System.out.println("Error");
                                    }
                                    break;
                                default:
                                    System.out.println("Error");

                            }
                        }
                    }

                } else if (a == 2) {
                    System.out.println("Введите логин: ");
                    String b = new Scanner(System.in).nextLine();
                    System.out.println("Введите пароль");
                    String c = new Scanner(System.in).nextLine();

                    if (b.equals(login.getLogin()) && c.equals(login.getPassword())) {
                        System.out.println("1.Pay.\n" +
                                "2. Deposit.\n" +
                                "3. Transfer.\n" +
                                "4. Check balance.\n" +
                                "5. Withdraw\n" +
                                "6. Log out.");
                        int z = new Scanner(System.in).nextInt();
                        if (z == 1) {
                            if (car8.getPrice() <= bank1.getBalans()) {
                                System.out.println("ВЫ УСПЕШНО ВНЕСЛИ ОПЛАТУ");
                            } else {
                                System.out.println("У вас не хватаеть денги\nЧтобы пополнть баланс нажмите 1");
                                int x = new Scanner(System.in).nextInt();
                                switch (x) {
                                    case 1:
                                        System.out.println("Введите сумму: ");
                                        bank1.deposit(new Scanner(System.in).nextInt());
                                        System.out.println("Вы успешно пополнили счеть\nMenu-->1");
                                        int v = new Scanner(System.in).nextInt();
                                        switch (v) {
                                            case 1:
                                                System.out.println("1.Pay.\n" +
                                                        "2. Deposit.\n" +
                                                        "3. Transfer.\n" +
                                                        "4. Check balance.\n" +
                                                        "5. Withdraw\n" +
                                                        "6. Log out.");
                                                int n = new Scanner(System.in).nextInt();
                                                switch (n) {
                                                    case 1:
                                                        System.out.println("Введите сумму: ");
                                                        bank1.pay(new Scanner(System.in).nextInt());
                                                        System.out.println("ВЫ УСПЕШНО ВНЕСЛИ ОПЛАТУ");
                                                        break;
                                                    case 2:
                                                        System.out.println("Введите сумму: ");
                                                        bank1.deposit(new Scanner(System.in).nextInt());
                                                        break;
                                                    case 3:
                                                        System.out.println("Введите сумму: ");
                                                        bank1.transfer(new Scanner(System.in).nextInt());
                                                        break;
                                                    case 4:
                                                        bank1.getBalans();
                                                        break;
                                                    case 5:
                                                        System.out.println("Введите сумму: ");
                                                        bank1.withdraw(new Scanner(System.in).nextInt());
                                                        break;
                                                    case 6:
                                                        break;
                                                }
                                                break;
                                            default:
                                                System.out.println("Error");
                                        }
                                        break;
                                    default:
                                        System.out.println("Error");

                                }
                            }
                        } else if (z == 2) {
                            System.out.println("Введите сумму: ");
                            bank1.deposit(new Scanner(System.in).nextInt());
                        } else if (z == 3) {
                            System.out.println("Введите сумму: ");
                            bank1.transfer(new Scanner(System.in).nextInt());
                        } else if (z == 4) {
                            bank1.getBalans();
                        } else if (z == 5) {
                            System.out.println("Введите сумму: ");
                            bank1.withdraw(new Scanner(System.in).nextInt());
                        } else if (z == 6) {

                        }
                    } else {
                        System.out.println("Неправильной пароль");
                    }
                }

            }
        }
    }

}