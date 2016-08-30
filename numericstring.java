 Scanner sc=new Scanner(System.in);
          String  s=sc.nextLine();int count=0;
          int l=s.length();
          char[] c=new char[l];
          c=s.toCharArray();
          for(int i=0;i<l;i++){
            for(char j='a';j<='z';j++){
                if(c[i]!=j){
                    count++;   
                    break;
                }else{
                    System.out.println(false);
                }
            }  
           }if(count==l){
               System.out.println(true);
           }    