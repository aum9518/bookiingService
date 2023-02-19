public class User {
  private   String firstName;
  private   String adress;
  private   long phoneNumber;
  private  String login;
  private  String password;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber=phoneNumber;
    }
    public void bookCar(Car car){
        if (!car.isBooked()){
            car.setBooked(true);
            System.out.println(firstName+" успешно забронировали: "+car.getModel());
        }else {
            System.out.println(car.getBrand()+car.getModel()+" Уже бронировано");
        }
    }

}
