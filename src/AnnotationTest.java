import annotation.Check;

/*
 Example from
 https://edu.csdn.net/skill/java/java-2a49f5098abf48ec8e9234d2fe460ff0?category=479&typeId=19908

  Use TestTool to get and run all Annotated methods (@Check) and catch exception if any.

  @Check is an annotation
    Run TestTool in IDE.

 */

public class AnnotationTest {
    @Check
    public void suanShu(){
        System.out.println("1234567890");
    }
    @Check
    public void jiafa(){
        System.out.println("1+1="+1+1);
    }
    @Check
    public void jiefa(){
        System.out.println("1-1="+(1-1));
    }
    @Check
    public void chengfa(){
        System.out.println("3 x 5="+ 3*5);
    }
    @Check
    public void chufa(){
        System.out.println("6 / 0="+ 6 / 0);
    }
    @Check
    public void ziwojieshao(){
        System.out.println("Bug testing");
    }
}