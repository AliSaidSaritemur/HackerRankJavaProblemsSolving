class Checker implements Comparator<Player>{
       @Override
    public int compare(Player arg0, Player arg1) {
      if(arg0.score < arg1.score){
        return 1;
      }else if(arg0.score > arg1.score){
          return -1;
      }else{
          return arg0.name.compareTo(arg1.name); 
      }
    } 
}