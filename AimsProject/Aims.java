package AimsProject;

public class Aims {
    public static void main(String[] args) {
        // Tạo một giỏ hàng mới
        Cart anOrder = new Cart();

        // Tạo các đối tượng DVD trực tiếp trong code
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 124, 24.95f);
        anOrder.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", 18.99f);
        anOrder.addDigitalVideoDisc(dvd3);

        // In ra tổng chi phí
        System.out.println("Total Cost is: ");
        System.out.println(anOrder.totalCost());

        // Test xóa sản phẩm
        anOrder.removeDigitalVideoDisc(dvd2);
        System.out.println("Total Cost after removal is: ");
        System.out.println(anOrder.totalCost());
    }
}