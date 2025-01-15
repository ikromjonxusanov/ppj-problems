
public class SimpleArrayList {
    private final static int INITIAL_CAPACITY = 2;
    private int cap = INITIAL_CAPACITY;
    private int size = 0;
    private int[] arr = new int[cap];

    public SimpleArrayList() {
    }

    public SimpleArrayList(SimpleArrayList a) {
        cap = a.cap;
        size = a.size;
        arr = a.arr.clone();
    }

    public SimpleArrayList insert(int ind, int e) {
        if (ind < 0 || ind > size) throw new IndexOutOfBoundsException();
        ensureCapacity(size + 1);
        for (int i = 0, k = 0; i < arr.length-1; i++) {
            System.out.println(arr[i]);
            if (i != ind) {
                arr[i + k] = arr[i];
            } else {
                arr[i + 1] = arr[i];
                arr[i] = e;
                k++;
            }
        }
        size += 1;
        return this;
    }

    public SimpleArrayList insert(int ind, int[] e) {
        if (ind < 0 || ind > arr.length - 1) throw new IndexOutOfBoundsException();
        ensureCapacity(size + e.length);
        System.arraycopy(arr, ind, arr, ind + e.length, size - ind);
        System.arraycopy(e, 0, arr, ind, e.length);
        size += e.length;
        return this;
    }

    public SimpleArrayList append(int e) {
        ensureCapacity(size + 1);
        arr[size++] = e;
        return this;
    }

    public SimpleArrayList append(int[] a) {
        ensureCapacity(size + 1);
        System.arraycopy(a, 0, arr, size, a.length);
        size += a.length;

        return this;
    }

    public SimpleArrayList append(SimpleArrayList a) {
        ensureCapacity(size + a.size);
        System.arraycopy(a.arr, 0, arr, size, a.size);
        size += a.size;
        return this;
    }

    public int get(int ind) throws IndexOutOfBoundsException {
        if (ind < 0 || ind > size) throw new IndexOutOfBoundsException();
        return arr[ind];
    } // done

    public String toString() {
        String output = "[ ";
        for (int i = 0; i < size(); i++) {
            if (i == size() - 1) {
                output += arr[i] + " ]";
                continue;
            }
            output += arr[i] + " ";
        }
        return "Cap=" + cap + ", size=" + size + ": " + output;
    }// done

    public SimpleArrayList set(int ind, int val) {
        if (ind < 0 || ind > size) throw new IndexOutOfBoundsException();
        arr[ind] = val;
        return this;
    } // done

    public int size() {
        return size;
    } // done

    public void trim() {
        if (size < cap) {
            int[] newArr = new int[size];
            System.arraycopy(arr, 0, newArr, 0, size);
            arr = newArr;
            cap = size;
        }
    }  // done

    private void ensureCapacity(int requiredCapacity) {
        if (cap < requiredCapacity) {
            cap = Math.max(cap * 2, requiredCapacity);
            int[] newArr = new int[cap];
            System.arraycopy(arr, 0, newArr, 0, size);
            arr = newArr;
        }
    } // done

    public static void main(String[] args) {
        SimpleArrayList a =
                new SimpleArrayList()
                        .append(new int[]{1, 3})
                        .insert(1, 2).append(6).insert(3, new int[]{4, 5});
        SimpleArrayList b = new SimpleArrayList(a);
        for (int i = 0; i < a.size(); ++i)
            a.set(i, a.get(i) + 6);

        b.append(a).append(13).trim();
        System.out.println("a -> " + a);
        System.out.println("b -> " + b);

    }
}