package fi15ae.kw52.tag1.mockito;

public class UserService {

  private final UserRepository userRepository;

  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public String getUserEmail(Long id) {
    User user = userRepository.findById(id);
    if (user == null) {
      throw new IllegalArgumentException("User not found");
    }
    return user.getEmail();
  }
}
