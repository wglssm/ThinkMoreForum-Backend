package com.thinkmore.forum.dto.notification;

import com.thinkmore.forum.dto.users.UsersPostDto;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
public class NotificationPostDto implements Serializable {
    private UsersPostDto users;
    private Boolean viewed;
}