 Scanner sc=new Scanner(System.in);int n=sc.nextInt(); Scanner sc1=new Scanner(System.in);
         int count=0,count1=0;
         String[] s=new String[n]; 
         int[] b=new int[n];
         for(int k=0;k<n;k++){
            s[k]=sc1.nextLine();
       int l=s[k].length();char t;
       char[] a=new char[l];
       a=s[k].toCharArray();
       for(int i=0;i<l;i++){if(a[i]!='\0'){
           count=0;
              for(int j=i+1;j<l;j++){
               if(a[i]==a[j]){
                   count++;
                     a[j]='\0';if(count>count1){
                        count1=count;
                      }}}
       }}b[k]=count1;}
           int k;
       String m=" ",z=" ";int x=0;
        for(int i=0;i<n;i++){ 
        for(int j=i+1;j<n;j++){
             if(b[i]>x){
                 z=" ";
                 x=b[i];
                 m=s[i];
                 s[i]=s[j];
                 s[j]=m;
                 z=s[i];
                  }}}System.out.println(z);