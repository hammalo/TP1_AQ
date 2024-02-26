import org.example.Stack;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StackTest {
    Stack stack =new Stack();
    @Test
    //pile n'est pas pliene
    void PushShouldAddElementToTheTopOfTheStack(){
        stack.push(4);
        Assertions.assertEquals(1,stack.size());
        Assertions.assertEquals(4,stack.peek());

    }

    void PushShouldExpandArrayIfStackIsFull(){
        //remplissage de la pile 0-->9
        Assertions.assertEquals(10,stack.size());
        stack.push(10);
        Assertions.assertEquals(11,stack.size());
        Assertions.assertEquals(10,stack.peek());
    }
}
