            case 2:
                {
                String v2[]=new String[5];
                for (int i=0;i<5;i++)
                {
                 System.out.println("Ingrese las vocales");
                v2[i]=teclado.next();
                }
                for (int i=0;i<5;i++)
                {
                    System.out.print(v2[i]+"\n");
                }
                }
            case 3:
                {
                String v1[]=new String[5];
                for (int i=0;i<5;i++)
                {
                 System.out.println("Ingrese 5 numeros enteros");
                v1[i]=teclado.next();
                }
                for (int i=0;i<5;i++)
                {
                    System.out.print(v1[i]+"\n");
                }
                }
            case 4:
                {
                String v1[]=new String[5];
                for (int i=0;i<5;i++)
                {
                System.out.println("Ingrese 5 numero flotantes");
                v1[i]=teclado.next();
                }
                for (int i=0;i<5;i++)
                {
                    System.out.print(v1[i]+"\n");
                }
                }
           default:
                System.out.println("Opción no valida ");
                break;
        }
    }while(opcion!=0);
    }
    
}
