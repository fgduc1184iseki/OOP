package AimsProject;

public class Cart {
    final int MAX_NUMBERS_ORDERED = 20;
    private static int qtyOrdered = 0;
    DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            qtyOrdered++;
            itemsOrdered[qtyOrdered - 1] = disc;
            System.out.println("The disc has been added");
        } else {
            System.out.println("The cart is almost full");
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (disc == itemsOrdered[i]) {
                qtyOrdered--;
                for (int j = i; j < qtyOrdered; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                System.out.println("The disc has been removed.");
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
}
