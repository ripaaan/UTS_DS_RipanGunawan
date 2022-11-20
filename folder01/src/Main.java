
class UTS {
    static void bubbleShort(int[] arr){
                int n = arr.length;
                int temp = 0;
                for (int i=0; i < n; i++) {
                    for(int j=1; j<(n-i); j++){
                        if (arr[j-1]> arr[j]){
                            temp = arr [j-1];
                            arr[j-1] = arr [j];
                            arr [j] = temp ;

                        }
                    }
                }
            }
            public static void main (String[] args) {
                int arr[] = {1, 3, 4, 6, 8, 0, 14, 12, 19, 2, 11};

                System.out.println("sebelum");
                for (int i = 0; i < arr.length; i++) {
                    System.out.println(arr[i] + " ");

                }
                System.out.println();

                bubbleShort(arr);

                System.out.println("sesudah");
                for (int i = 0; i < arr.length; i++) {
                    System.out.println(arr[i] + " ");
                }
            }
        }
    
