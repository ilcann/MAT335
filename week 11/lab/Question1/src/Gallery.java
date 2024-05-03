
public class Gallery {
    private String galleryName;
    private Car[] cars;
    private int carsCount;
    private int capacity;
    private Person galleryOwner;

    public Gallery(String galleryName, int capacity, Person galleryOwner) {
        this.galleryName = galleryName;
        this.capacity = capacity;
        this.cars = new Car[capacity];
        this.galleryOwner = galleryOwner;
        this.carsCount = 0;
    }

    public String getGalleryName() {
        return galleryName;
    }
    public void setGalleryName(String galleryName) {
        this.galleryName = galleryName;
    }
    public String getGalleryOwner() {
        return this.galleryOwner.introduceSelf();
    }
    public Car[] getCars() {
        return cars;
    }
    public void addCar(Car car) {
        if (this.carsCount < this.capacity) {
            this.cars[this.carsCount] = car;
            this.carsCount++;
        }
        else {
            System.out.println("Gallery is full");
        }
    }
    public boolean searchCar(Car car)
    {
        for (int i = 0; i < this.carsCount; i++) {
            if (this.cars[i] == car)
                return true;
            else
                continue;
        }
        return false;
    }
    public boolean searchCar(String plate)
    {
        for (Car car : cars)
        {
            if (car != null )
            {
                if (car.getPlate().equals(plate)) 
                    return true;
                else
                    continue;
            }
            else
                continue;
        }
        return false;
    }
    public String introduceSelf()
    {
        String galleryInfo = "GALLERY INFO" + "\n" + "Gallery Name: " + this.getGalleryName() + "\n"+ "Gallery Owner: " + this.getGalleryOwner() + "\n" + "The car count: " + this.carsCount;
        return galleryInfo;
    }
}
