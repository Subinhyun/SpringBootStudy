package dev.yoon.board.dto;

import dev.yoon.board.domain.Post;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class PostDto {

    private Long boardId;

    private String title;

    private String content;

    private String writer;

    private String pw;

//    @JsonIgnore
//    private List<MultipartFile> files = new ArrayList<>();

    public static PostDto createPostDto(Post post) {
        PostDto postDto = new PostDto();
        postDto.setBoardId(post.getBoard().getId());
        postDto.setTitle(post.getTitle());
        postDto.setWriter(post.getWriter());
        postDto.setPw(post.getPw());
        postDto.setContent(post.getContent());
        return postDto;
    }

}
