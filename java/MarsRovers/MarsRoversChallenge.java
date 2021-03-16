import  java.util.Scanner;

class Robo{                               //Classe robo com atributos da classe Coordenada, pois o mesmo ocupa lugar no espaço
  Coordenada dir= new Coordenada();

  void Movimenta(){                      //Método Movimenta, que utiliza atributos espaciais de seu atributo dir para readequar sua posição
    if (this.dir.pos.equals("N")) {
      this.dir.y=this.dir.y+1;
    }
    else if (this.dir.pos.equals("S")) {
      this.dir.y=this.dir.y-1;
    }
    else if (this.dir.pos.equals("E")) {
      this.dir.x=this.dir.x+1;
    }
    else if (this.dir.pos.equals("W")) {
        this.dir.x=this.dir.x-1;
    }
    else{
      System.out.println("Coordenada direcional invalida, aceito apenas: N, S, E e W");
    }
  }

  void MudaDirecao(char dir){                 //Método muda direção indica para qual cardinal  a ponta do robô está apontando, N, S, E, W.

    if   ((dir=='R' && this.dir.pos.equals("N")) || (dir=='L' && this.dir.pos.equals("S")) ){
      this.dir.pos="E";
    }
    else if (   (dir=='R' && this.dir.pos.equals("E"))   ||    (dir=='L' && this.dir.pos.equals("W"))   ) {
      this.dir.pos="S";
    }
    else if (   (dir=='R' && this.dir.pos.equals("S"))   ||    (dir=='L' && this.dir.pos.equals("N"))   ) {
      this.dir.pos="W";
    }
    else if (   (dir=='R' && this.dir.pos.equals("W"))   ||    (dir=='L' && this.dir.pos.equals("E"))   ) {
      this.dir.pos="N";
    }

  }


}

class Coordenada{                             //A classe coordenada foi criada com intuito de facilitar a inicialização das principais variáveis.
    int x;
    int y;
    String pos;

  void Construct(int x,int y, String pos ){   //Método para inicializar as variáveis
    this.x=x;
    this.y=y;
    this.pos=pos;
  }

  void MostraCoord(){                       //Método para exibir as variáveis
      System.out.printf("%d %d %s", this.x, this.y, this.pos);
  }

}

class Verifica{
  void Verif(String instr, Robo robo){

    for (int i=0;i<instr.length() ;i++ ) {
      if (instr.charAt(i)=='M') {
        robo.Movimenta();
      }
      else if (instr.charAt(i)=='R' || instr.charAt(i)=='L') {
        robo.MudaDirecao(instr.charAt(i));
      }
      else{
        System.out.println("Este nao eh um comando aceito, utilize apenas R, L  e M");
      }
    }

  }
}


class Main{
  public static void main(String[] args) {

    //Bloco incializador das classes
    Scanner       a = new Scanner(System.in); //Objeto para receber inputs
    Robo        robo=new Robo();              //Objeto principal, que faz movimentações e recebe coordenadas como herança da classe Coordenada
    Verifica  valida=new Verifica();          //Objeto validador, utilizado para verificar se letras digitadas estavam ou não conformes 

    //Bloco incializador de variáveis.
    int          x = a.nextInt();
    int          y = a.nextInt();
    String     pos = a.next();
    String    instr=a.next();

    System.out.printf("\n\n\n");
    robo.dir.Construct(x, y, pos);
    valida.Verif(instr, robo);
    robo.dir.MostraCoord();

  }
}
