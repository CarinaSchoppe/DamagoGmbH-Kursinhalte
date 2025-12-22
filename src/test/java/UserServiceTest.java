import fi15ae.kw52.tag1.mockito.User;
import fi15ae.kw52.tag1.mockito.UserRepository;
import fi15ae.kw52.tag1.mockito.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class UserServiceTest {


  @Mock
  private UserRepository userRepository;


  @InjectMocks
  private UserService userService;


  @Test
  void shouldReturnUserEmail() {

    User mockUser = new User("test@email.com");
    Mockito.when(userRepository.findById(1L)).thenReturn(mockUser);

    String email = userService.getUserEmail(1L);

    Assertions.assertEquals("test@email.com", email);
    Mockito.verify(userRepository).findById(1L);

  }


}
