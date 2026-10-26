package AimsProject;

public class Cart {
    final int MAX_NUMBERS_ORDERED = 20;
    private static int qtyOrdered = 0;
    DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            qtyOrdered++;
            itemsOrdered[qtyOrdered - 1] = disc;
            System.out.println("The disc has been added: " + itemsOrdered[qtyOrdered - 1].getid());
        } else {
            System.out.println("The cart is almost full");
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc... dvddisc) {
        for (DigitalVideoDisc temp : dvddisc) {
            if (temp != null) {
                addDigitalVideoDisc(temp);
            }
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (disc == itemsOrdered[i]) {
                qtyOrdered--;
                for (int j = i; j < qtyOrdered; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                itemsOrdered[qtyOrdered] = null;
                System.out.println("The disc:" + disc.getid() + " has been removed.");
                break;

            }

        }
        System.out.println("The disc is not found in the cart.");
    }

    public float totalCost() {
        float tong = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            tong = tong + itemsOrdered[i].getcost();

        }
        return tong;
    }

    public void printCart() {
        System.out.println("*********************** CART ***********************");
        System.out.println("Ordered Items:");

        // Duyệt qua danh sách các đĩa trong giỏ hàng
        // (Giả sử bạn dùng mảng hoặc ArrayList tên là itemsOrdered)
        int i = 1;
        for (DigitalVideoDisc disc : itemsOrdered) {
            if (disc != null) {
                // In theo định dạng số thứ tự. Tiêu đề - Thể loại - Đạo diễn - Thời lượng: Giá
                // $
                System.out.println(i + ". DVD [" + disc.gettitle() + "] - ["
                        + disc.getcategory() + "] - ["
                        + disc.getdirecctor() + "] - ["
                        + disc.getlegth() + " mins]: "
                        + disc.getcost() + " $");
                i++;
            }
        }

        // In tổng chi phí của giỏ hàng
        System.out.println("Total cost: " + totalCost() + " $");
        System.out.println("***************************************************");
    }

    public DigitalVideoDisc search(int id) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (id == itemsOrdered[i].getid())
                return itemsOrdered[i];
        }
        System.err.println("not found");
        return null;

    }
}
