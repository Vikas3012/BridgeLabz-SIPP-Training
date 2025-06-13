//CP - Write a Program to compute the volume of Earth in km^3 and miles^3
//Hint => Volume of a Sphere is (4/3) * pi * r^3 and radius of earth is 6378 km
//O/P => The volume of earth in cubic kilometers is ____ and cubic miles is ____
class VolumeOfEarth {
    public static void main(String[] args) {
        float r = 6378;
        float volume = (4/3) * 3.14F * r*r*r;
        float vInKm = volume;
        float vInMiles = volume*1.6F;
        System.out.println("The volume of earth in cubic kilometers is : " + vInKm  +" and cubic miles is : " + vInMiles);
    }
}