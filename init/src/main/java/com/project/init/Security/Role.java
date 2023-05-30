/*
 * package com.project.init.Security;
 * 
 * import java.util.Collections; import java.util.List; import java.util.Set;
 * import java.util.stream.Collectors;
 * 
 * import org.springframework.security.core.authority.SimpleGrantedAuthority;
 * 
 * import lombok.Getter; import lombok.RequiredArgsConstructor;
 * 
 * @RequiredArgsConstructor public enum Role {
 * 
 * USER(Collections.emptySet()), ADMIN( Set.of( Permission.ADMIN_READ,
 * Permission.ADMIN_UPDATE, Permission.ADMIN_DELETE, Permission.ADMIN_CREATE ));
 * 
 * @Getter private final Set<Permission> permissions;
 * 
 * public List<SimpleGrantedAuthority> getAuthorities(){ var authories =
 * getPermissions() .stream() .map(permission -> new
 * SimpleGrantedAuthority(permission.name())) .toList(); authories.add(new
 * SimpleGrantedAuthority("ROLE_" + this.name())); return authories; }
 * 
 * }
 */