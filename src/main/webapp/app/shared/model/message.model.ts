import dayjs from 'dayjs';

export interface IMessage {
  id?: string;
  receivedAt?: string;
  version?: number;
}

export const defaultValue: Readonly<IMessage> = {};
