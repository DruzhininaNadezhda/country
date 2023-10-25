package Books;


public class PublishingHouse {

    private String namePublishingHouse;
    private String cityPublishingHouse;


    public String getNamePublishingHouse() {
        return namePublishingHouse;
    }

    public void setNamePublishingHouse(String namePublishingHouse) throws IllegalArgumentException {
        if (namePublishingHouse == null || namePublishingHouse.isEmpty()) {
            throw new IllegalArgumentException("Необходимо ввести название издательства");
        }
        this.namePublishingHouse = namePublishingHouse;
    }

    public String getCityPublishingHouse() {
        return cityPublishingHouse;
    }

    public void setCityPublishingHouse(String cityPublishingHouse) throws IllegalArgumentException {
        if (cityPublishingHouse == null || cityPublishingHouse.isEmpty()) {
            throw new IllegalArgumentException("Необходимо ввести город издательства");
        }
        this.cityPublishingHouse = cityPublishingHouse;
    }

    public PublishingHouse(String namePublishingHouse, String cityPublishingHouse) {
        setCityPublishingHouse(cityPublishingHouse);
        setNamePublishingHouse(namePublishingHouse);
    }
    public PublishingHouse () {

    }

    public String toString() {
        return getCityPublishingHouse() +" " + getNamePublishingHouse();
    }
}

