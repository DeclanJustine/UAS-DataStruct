package strukdat;

class Node<T> {
    T data;
    Node<T> next;

    Node(T value) {
        data = value;
        next = null;
    }
}

public class SingleList<T> {
    Node<T> head;
    Node<T> tail;

    //constructor
    public SingleList() {
        head = null;
        tail = null;
    }

    // Menyisipkan setiap node baru yang dibuat di akhir list
    public void pushQ(T value) {
        //buat node baru
		Node<T> newNode = new Node<T>(value);
        //jika list kosong, head dan tail sama-sama menunjuk ke node pertama
		if (head == null) {
            head = newNode;
            tail = newNode;
        }
        //jika tidak kosong, tail diupdate untuk menunjuk ke node baru
		else {
			tail.next = newNode;
            tail = newNode;
		}
	}

    // Meletakkan setiap node baru yang dibuat di awal list (stack)
    public void pushS(T value) {
        //buat node baru
		Node<T> newNode = new Node<T>(value);
        //jika list kosong, head dan tail sama-sama menunjuk ke node pertama
		if (head == null) {
			head = newNode;
			tail = newNode;
		}
        //jika tidak kosong, node baru menunjuk ke node pertama di list
        //head diupdate untuk menunjuk ke node baru
		else {
            newNode.next = head;
			head = newNode;
		}
	}

    //Mencetak bagian informasi dari setiap node di linkedlist
    public void cetakList() {
        //set pointer curr untuk menunjuk ke node pertama (node pertama yang ditunjuk oleh head)
		Node<T> curr = head;
        //jika list kosong, tampilkan pesan list kosong
		if(curr == null) System.out.println("List kosong!");
        /*
         * jika list tidak kosong, maka cetak bagian informasi 
           dari setiap node yang dikunjungi. 
        */
		else {
			while(curr != null) {
				System.out.print( " -> "+curr.data.toString() );
                /*
                 * curr diupdate untuk menunjuk ke node selanjutnya
                 * sampai curr null, dimana curr diset ke bagian 'next' 
                 * dari node terakhir yang bernilai null. Artinya, 
                 * pointer curr sudah ada di akhir list.
                 */
				curr = curr.next;
			}
		}
	}


    //Mengambil dan menghapus elemen pertama di queue dan stack
    public Node<T> pop() {
        Node<T> n;
        if(head == null) n = null;
        else {
            n = head;
            head = head.next;
            if (head == null) {
                tail = null;
            }   
        }
        return n;
    }

    //return bagian data dari node
    public T remove() {
        Node<T> n = pop();
        if(n == null) return null;
        else return n.data;
    }

    //@overloading method remove()
    public boolean remove(T data) {
        Node<T> curr = head;
        Node<T> prev = head;
        boolean deleted = false;

        while(curr != null && !deleted) {
            // jika setiap elemen dari data sama
            // dengan data yang dicari
            if(curr.data.equals(data)) {
                deleted = true;
                //node sebelum dilink ke node berikut dari node yang diremove
                prev.next = curr.next; 
                //jika node pertama yang diremove, update head ke node kedua
                if(curr == head) head = head.next;
                //jika list hanya memiliki satu nod, set head = null (list kosong)         
                if(head == null) tail = null;
            }
            //jika belum ditemukan node yang akan diremove
            //simpan pointer ke node saat ini, dan update
            //pointer ke node berikutnya
            else {
                prev = curr;
                curr = curr.next;
            }
        }

        return deleted;
    }

    //mengecek apakah list kosong atau tidak
    public boolean isEmpty() {
        if(head == null) return true;
        else return false;
    }
}



